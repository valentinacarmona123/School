package co.edu.umanizales.school.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Grade {
    private int level;
    private String name;
    
    // Common grade levels
    public static final Grade FIRST_GRADE = new Grade(1, "First Grade");
    public static final Grade SECOND_GRADE = new Grade(2, "Second Grade");
    public static final Grade THIRD_GRADE = new Grade(3, "Third Grade");
    public static final Grade FOURTH_GRADE = new Grade(4, "Fourth Grade");
    public static final Grade FIFTH_GRADE = new Grade(5, "Fifth Grade");
    
    public static Grade fromLevel(int level) {
        return switch (level) {
            case 1 -> FIRST_GRADE;
            case 2 -> SECOND_GRADE;
            case 3 -> THIRD_GRADE;
            case 4 -> FOURTH_GRADE;
            case 5 -> FIFTH_GRADE;
            default -> throw new IllegalArgumentException("Invalid grade level: " + level);
        };
    }
    
    @Override
    public String toString() {
        return name;
    }
}
