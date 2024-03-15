package com.example.flpptask1.service;

import com.example.flpptask1.exceptions.NoEmployeesFoundException;
import com.example.flpptask1.model.Employee;
import com.example.flpptask1.repository.EmployeeRepository;
import com.example.flpptask1.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmployeeServiceImplementation implements EmployeeService {


    private EmployeeRepository employeeRepository;

    public EmployeeServiceImplementation(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public Employee registerEmployee(Employee employee) {
        log.info(employee.toString());
        this.employeeRepository.save(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() throws NoEmployeesFoundException {

        List<Employee> employees = this.employeeRepository.findAll();
        if(employees.isEmpty())
            throw new NoEmployeesFoundException("No Employees exist in the List");
        return employees;
    }
}
