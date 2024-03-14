package com.example.flpptask1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Employee registerEmployee(Employee employee) {

        log.info(employee.toString());
        this.employeeRepository.save(employee);

        return employee;
    }

    @Override
    public List<Employee> getAllEmplyess() {
        return employeeRepository.findAll();
    }
}
