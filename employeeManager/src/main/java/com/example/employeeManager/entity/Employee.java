package com.example.employeeManager.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee_data")
public class Employee implements Serializable {

    @Id
    @Column(name = "employee_id", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name")
    private String name;

    private String email;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "mobile_number")
    private String phone;

    @Column(name = "residence_city")
    private String city;

    @Column(name = "employee_code", nullable = false, updatable = false, unique = true)
    private String employeeCode;

}
