package com.example.flpptask1.service;

import com.example.flpptask1.dto.EmployeeRequest;
import com.example.flpptask1.model.Employee;

import java.util.List;

public interface EmployeeService{
    Employee registerEmployee(EmployeeRequest employeeRequest);
    List<Employee> getAllEmplyess();
}
