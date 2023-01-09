package com.nhnacademy.Test.department;

import com.nhnacademy.Test.department.repository.DepartmentEmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class DepartmentApplication {
	//private final DepartmentEmployeeRepository departmentEmployeeRepository;

	public static void main(String[] args) {

		SpringApplication.run(DepartmentApplication.class, args);
	}

}
