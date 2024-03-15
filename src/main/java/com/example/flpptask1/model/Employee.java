package com.example.flpptask1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.id.factory.internal.AutoGenerationTypeStrategy;
import org.hibernate.validator.constraints.Range;
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
    @NotNull @NotBlank @Size(min = 3, max = 15)
    String firstName;
    String middleName;
    @NotNull @NotBlank @Size(min = 3, max = 15)
    String lastName;
    LocalDate registrationDate;

    @Range(min = 20, max = 60)
    Integer age;

}
