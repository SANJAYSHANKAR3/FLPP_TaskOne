package com.example.flpptask1.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Component
public class EmployeeRequest {
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




    @Min(value = 20, message = "Age must be at least 20")
    @Max(value = 60, message = "Age must not exceed 60")
    Integer age;
}
