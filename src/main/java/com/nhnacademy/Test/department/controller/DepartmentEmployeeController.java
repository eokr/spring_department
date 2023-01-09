package com.nhnacademy.Test.department.controller;

import com.nhnacademy.Test.department.domain.DepartmentEmployeeDto;
import com.nhnacademy.Test.department.service.DepartmentEmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DepartmentEmployeeController {

    private final DepartmentEmployeeService departmentEmployeeService;

    @GetMapping("/department-members")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<DepartmentEmployeeDto> getDepartmentEmployeeByDepartmentCode(@RequestParam String[] departmentIds){
        return departmentEmployeeService.getDepartmentEmployeeDto(departmentIds);
    }
}
//GET /department-members?departmentIds=L1001,{부서 코드}