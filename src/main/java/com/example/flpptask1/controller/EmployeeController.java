package com.example.flpptask1.controller;

import com.example.flpptask1.exceptions.NoEmployeesFoundException;
import com.example.flpptask1.service.EmployeeService;
import com.example.flpptask1.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;


@RestController
@Slf4j
public class EmployeeController {
    final
    EmployeeService employeeService;
    private Employee employee;


    public EmployeeController(EmployeeService employeeService, Employee employee) {
        this.employeeService = employeeService;
        this.employee = new Employee(101, "Ram", "Mathan", "Kumar", LocalDate.now(), 23);


    }

    @PostMapping("employee")
    Employee addEmployee(@RequestBody Employee employee) {
        return this.employeeService.registerEmployee(employee);

    }

    @GetMapping("employee")
    Employee getEmployee() {
        return this.employee;
    }

    @GetMapping("employees")
    List<Employee> getAllEmployees() throws NoEmployeesFoundException {

//
        return this.employeeService.getAllEmployees();
    }
}



