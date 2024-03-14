package com.example.flpptask1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {
    final
    EmployeeService employeeSevice;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeSevice = employeeService;
    }

    @PostMapping("employee")
    Employee addEmployee(@RequestBody Employee employee){
        return this.employeeSevice.registerEmployee(employee);
    }
}
