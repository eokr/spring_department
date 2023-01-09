package com.nhnacademy.Test.department.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @Column(name = "employee_number")
    private Integer employeeNumber;

    @Column(name = "employee_name")
    private String employeeName;
}
