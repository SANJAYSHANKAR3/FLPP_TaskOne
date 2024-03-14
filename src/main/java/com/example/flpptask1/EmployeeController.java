package com.example.flpptask1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class EmployeeController {
    final
    EmployeeService employeeService;
    private final Employee employee;

    public EmployeeController(EmployeeService employeeService, Employee employee) {
        this.employeeService = employeeService;
        this.employee = new Employee(101, "Ram", "Mathan", "Kumar", 23);

    }

    @PostMapping("employee")
    Employee addEmployee(@RequestBody Employee employee){
        return this.employeeService.registerEmployee(employee);

    }

    @GetMapping("employees")
   Employee getEmployee(){
        return this.employee;
    }
}
