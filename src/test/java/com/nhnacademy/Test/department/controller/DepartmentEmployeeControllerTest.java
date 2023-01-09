package com.nhnacademy.Test.department.controller;

import com.nhnacademy.Test.department.repository.DepartmentEmployeeRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DepartmentEmployeeControllerTest {

    @Autowired
    MockMvc mvc;

    @MockBean
    private DepartmentEmployeeRepository departmentEmployeeRepository;

    @Test
    @DisplayName("부서코드를 인자로 부서코드에 대한 사원 목록 조회, 부서코드를 안넣었을 때 테스트")
    void getDepartmentEmployeeByDepartmentCode() throws Exception {
        mvc.perform(get("/department-members"))
                .andExpect(status().is4xxClientError());
    }
}