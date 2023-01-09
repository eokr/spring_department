package com.nhnacademy.Test.department.service;

import com.nhnacademy.Test.department.entity.Employee;
import com.nhnacademy.Test.department.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    @Override
    public void save(Integer employeeNumber, String employeeName) {
        Employee employee = new Employee(employeeNumber, employeeName);
        employeeRepository.save(employee);
    }

    @Override
    public void deleteAll() {
        employeeRepository.deleteAll();
    }
}
