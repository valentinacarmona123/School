package co.edu.umanizales.school.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Classroom {
    private String code;
    private String building;
    private int floor;
    private int capacity;
    private List<String> equipment = new ArrayList<>();
    private boolean hasProjector;
    private boolean hasAirConditioning;

    public boolean canAccommodate(int numberOfStudents) {
        return numberOfStudents <= capacity;
    }

    public void addEquipment(String item) {
        if (!equipment.contains(item)) {
            equipment.add(item);
        }
    }

    public void removeEquipment(String item) {
        equipment.remove(item);
    }
}
