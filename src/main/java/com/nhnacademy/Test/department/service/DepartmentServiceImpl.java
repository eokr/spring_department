package com.nhnacademy.Test.department.service;

import com.nhnacademy.Test.department.entity.Department;
import com.nhnacademy.Test.department.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService{

    private final DepartmentRepository departmentRepository;

    @Override
    public void save(String departmentCode, String department) {
        Department saveDepartment = new Department(departmentCode, department);
        departmentRepository.save(saveDepartment);
    }

    @Override
    public void deleteAll() {
        departmentRepository.deleteAll();
    }
}
