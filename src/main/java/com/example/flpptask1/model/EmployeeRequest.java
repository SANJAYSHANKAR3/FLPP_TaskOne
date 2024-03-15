package com.example.flpptask1.model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequest {

    String firstName;
    String middleName;
    String lastName;
    LocalDate registrationDate;
    Integer age;
}
