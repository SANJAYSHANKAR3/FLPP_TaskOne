package com.example.flpptask1.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

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
    String firstName;
    String middleName;
    String lastName;
    Integer age;
}
