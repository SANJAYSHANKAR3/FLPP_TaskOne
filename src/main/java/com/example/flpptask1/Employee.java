package com.example.flpptask1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.id.factory.internal.AutoGenerationTypeStrategy;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Setter
@Getter
@Entity
@Component
public class Employee {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    Integer id;
    String firstName;
    String middleName;
    String lastName;
    LocalDate registrationDate;
    Integer age;

    public Employee(String firstName, String middleName, String lastName, Integer age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.registrationDate = LocalDate.now();
        this.age = age;
    }

    public Employee(Integer id, String firstName,String middleName,String lastName, Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.registrationDate = LocalDate.now();
        this.age = age;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id='"+id+'\''+
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", registrationDate=" + registrationDate +
                ", age=" + age +
                '}';
    }



}
