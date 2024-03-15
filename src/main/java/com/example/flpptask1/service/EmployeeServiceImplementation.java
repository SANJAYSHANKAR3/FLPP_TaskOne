package com.example.flpptask1.service;

import com.example.flpptask1.dto.EmployeeRequest;
import com.example.flpptask1.model.Employee;
import com.example.flpptask1.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmployeeServiceImplementation implements EmployeeService {


    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImplementation(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public Employee registerEmployee(EmployeeRequest employeeRequest) {
        log.info(employeeRequest.toString());
        Employee employee = new Employee();
        employee.setId(employeeRequest.getId());
        employee.setFirstName(employeeRequest.getFirstName());
        employee.setMiddleName(employeeRequest.getMiddleName());
        employee.setLastName(employeeRequest.getLastName());
        employee.setAge(employeeRequest.getAge());
        this.employeeRepository.save(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
