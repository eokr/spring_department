package com.nhnacademy.Test.department.service;

import com.nhnacademy.Test.department.domain.DepartmentEmployeeDto;
import com.nhnacademy.Test.department.repository.DepartmentEmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentEmployeeServiceImpl implements DepartmentEmployeeService{

    private final DepartmentEmployeeRepository departmentEmployeeRepository;
    @Transactional(readOnly=true)
    public List<DepartmentEmployeeDto> getDepartmentEmployeeDto(String[] departmentCodes) {
        List<DepartmentEmployeeDto> departmentEmployeeDto = new ArrayList<>();
        for (String departmentCode : departmentCodes) {
            List<DepartmentEmployeeDto> departmentEmployeeDtoTemp = departmentEmployeeRepository.findByDepartment_DepartmentCode(departmentCode);

            departmentEmployeeDto.add(departmentEmployeeDtoTemp.get(0));
        }

        //List<DepartmentEmployeeDto> departmentEmployeeDto2 = departmentEmployeeRepository.findByDepartment_DepartmentCode(departmentCodes[0]);
        if(departmentEmployeeDto.isEmpty()){
            throw new RuntimeException("no DepartmentCode");
        }
        return departmentEmployeeDto;
    }
}