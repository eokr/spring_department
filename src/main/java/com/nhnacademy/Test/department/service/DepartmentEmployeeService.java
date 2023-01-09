package com.nhnacademy.Test.department.service;

import com.nhnacademy.Test.department.domain.DepartmentEmployeeDto;

import java.util.List;

public interface DepartmentEmployeeService{
    List<DepartmentEmployeeDto> getDepartmentEmployeeDto(String[] departmentCodes);
}
