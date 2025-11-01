package co.edu.umanizales.school.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GradeType {
    private String code;
    private String name;
    private String description;
    private double weight; // Weight in final grade calculation (0.0 to 1.0)

    // Common grade types
    public static final GradeType QUIZ = new GradeType("QUIZ", "Quiz", "Short assessment", 0.15);
    public static final GradeType HOMEWORK = new GradeType("HW", "Homework", "Take-home assignment", 0.20);
    public static final GradeType MIDTERM = new GradeType("MID", "Midterm Exam", "Midterm examination", 0.25);
    public static final GradeType FINAL = new GradeType("FINAL", "Final Exam", "Final examination", 0.30);
    public static final GradeType PROJECT = new GradeType("PROJ", "Project", "Class project", 0.10);

    public static GradeType fromCode(String code) {
        if (code == null) {
            throw new IllegalArgumentException("Grade type code cannot be null");
        }
        
        switch (code.toUpperCase()) {
            case "QUIZ":
                return QUIZ;
            case "HW":
                return HOMEWORK;
            case "MID":
                return MIDTERM;
            case "FINAL":
                return FINAL;
            case "PROJ":
                return PROJECT;
            default:
                throw new IllegalArgumentException("Unknown grade type: " + code);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
