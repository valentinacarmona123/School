package co.edu.umanizales.school.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GradeRecord {
    private String id;
    private Student student;
    private Subject subject;
    private double score;
    private LocalDate date;
    private GradeType type;
    private String comments;

    public boolean isPassing() {
        return score >= 3.0; // Passing grade is 3.0 or higher (on a 0-5 scale)
    }

    public String getLetterGrade() {
        if (score >= 4.5) return "A";
        if (score >= 4.0) return "B";
        if (score >= 3.0) return "C";
        if (score >= 2.0) return "D";
        return "F";
    }
}
