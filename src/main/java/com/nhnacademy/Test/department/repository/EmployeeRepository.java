package com.nhnacademy.Test.department.repository;

import com.nhnacademy.Test.department.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee findByEmployeeNumber(Integer employeeNumber);
}
