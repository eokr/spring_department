package com.nhnacademy.Test.department.domain;

public interface DepartmentEmployeeDto {

    EmployeeDto getEmployee();
    DepartmentDto getDepartment();

    interface EmployeeDto {
        Integer getEmployeeNumber();

        String getEmployeeName();
    }
    interface DepartmentDto {
        String getDepartmentCode();

        String getDepartment();
    }
}
