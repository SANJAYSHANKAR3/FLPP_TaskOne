package com.example.flpptask1.controller;

import com.example.flpptask1.dto.EmployeeRequest;
import com.example.flpptask1.model.Employee;
import com.example.flpptask1.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;


@RestController
public class EmployeeController {
    final
    EmployeeService employeeService;

    EmployeeRequest employeeRequest;

    public EmployeeController(EmployeeService employeeService, EmployeeRequest employeeRequest) {
        this.employeeService = employeeService;
        this.employeeRequest = new EmployeeRequest(101, "Ram", "Mathan", "Kumar", 23);
    }

    @PostMapping("employee")
    Employee addEmployee(@RequestBody EmployeeRequest employeeRequest){
        return this.employeeService.registerEmployee(employeeRequest);

    }

    @GetMapping("employee")
   EmployeeRequest getEmployeeRequest(){
        return this.employeeRequest;
    }

    @GetMapping("employees")
    List<Employee> getAllEmployees(){
        return this.employeeService.getAllEmplyess();
    }

}
