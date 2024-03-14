package com.example.flpptask1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Setter
@Getter
@Entity
public class Employee {
    @GeneratedValue
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

    public Employee(String firstName,String lastName, Integer age) {
        this.firstName = firstName;
        this.middleName = "";
        this.lastName = lastName;
        this.registrationDate = LocalDate.now();
        this.age = age;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", registrationDate=" + registrationDate +
                ", age=" + age +
                '}';
    }



}
