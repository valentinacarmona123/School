package co.edu.umanizales.school.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.DayOfWeek;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Schedule {
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;
    private Classroom classroom;

    public boolean overlapsWith(Schedule other) {
        if (this.dayOfWeek != other.dayOfWeek) {
            return false;
        }
        return !this.endTime.isBefore(other.startTime) && !this.startTime.isAfter(other.endTime);
    }
}
