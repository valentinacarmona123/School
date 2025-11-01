package co.edu.umanizales.school.model;

import co.edu.umanizales.school.dto.SubjectDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher extends Person {
    private String teacherId;
    private String specialization;
    private List<String> teachingSubjectIds = new ArrayList<>();  // IDs de las asignaturas
    private boolean fullTime;
    private double salary;

    public Teacher(String id, String name, String lastName, String email, String phone,
                  LocalDate birthDate, Gender gender, String address, boolean active, 
                  String teacherId, String specialization, boolean fullTime, double salary) {
        super(id, name, lastName, email, phone, birthDate, gender, address, active);
        this.teacherId = teacherId;
        this.specialization = specialization;
        this.fullTime = fullTime;
        this.salary = salary;
    }

    public void addSubject(String subjectCode) {
        if (!teachingSubjectIds.contains(subjectCode)) {
            teachingSubjectIds.add(subjectCode);
        }
    }

    public void removeSubject(String subjectCode) {
        teachingSubjectIds.remove(subjectCode);
    }
    
    // Método para obtener un DTO del profesor
    public TeacherDTO toDTO() {
        return new TeacherDTO(
            this.id,
            this.name,
            this.lastName,
            this.email,
            this.phone,
            this.birthDate,
            this.gender,
            this.address,
            this.active,
            this.teacherId,
            this.specialization,
            this.fullTime,
            this.salary,
            this.teachingSubjectIds
        );
    }
}
