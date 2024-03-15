package com.example.flpptask1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Component
public class Employee {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    Integer id;

    @NotNull
    @NotBlank
    @Size(min = 3, max = 15)
    String firstName;

    @Size(max = 15)
    String middleName;

    @NotNull
    @NotBlank
    @Size(min = 3, max = 15)
    String lastName;

    @Past(message = "Registration date must be in the past")
    LocalDate registrationDate;


    @Min(value = 20, message = "Age must be at least 20")
    @Max(value = 60, message = "Age must not exceed 60")
    Integer age;

}
