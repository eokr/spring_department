package com.nhnacademy.Test.department.repository;

import com.nhnacademy.Test.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, String> {

}
