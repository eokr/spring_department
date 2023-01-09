package com.nhnacademy.Test.department.repository;

import com.nhnacademy.Test.department.domain.DepartmentEmployeeDto;
import com.nhnacademy.Test.department.entity.DepartmentEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentEmployeeRepository extends JpaRepository<DepartmentEmployee, Integer> {
    List<DepartmentEmployeeDto> findByDepartment_DepartmentCode(String departmentCode);
}
