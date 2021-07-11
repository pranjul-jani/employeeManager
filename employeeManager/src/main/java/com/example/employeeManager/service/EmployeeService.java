package com.example.employeeManager.service;

import com.example.employeeManager.entity.Employee;
import com.example.employeeManager.exception.UserNotFoundException;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(Employee employee);

    List<Employee> findAllEmployee();

    Employee updateEmployee(Employee employee);

    Employee findEmployeeById(Long id) throws UserNotFoundException;

    void deleteEmployee(Long id);
}
