package co.edu.umanizales.school.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Gender {
    private String code;
    private String description;
    
    // Common gender instances
    public static final Gender MALE = new Gender("M", "Male");
    public static final Gender FEMALE = new Gender("F", "Female");
    public static final Gender OTHER = new Gender("O", "Other");
    
    public static Gender fromCode(String code) {
        if (code == null) return OTHER;
        
        switch (code.toUpperCase()) {
            case "M":
                return MALE;
            case "F":
                return FEMALE;
            default:
                return OTHER;
        }
    }
}
