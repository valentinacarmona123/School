package co.edu.umanizales.school.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Person {
    protected String id;
    protected String name;
    protected String lastName;
    protected String email;
    protected String phone;
    protected LocalDate birthDate;
    protected Gender gender;
    protected String address;
    protected boolean active;
}
