package com.example.employee_management_system.service;

import com.example.employee_management_system.model.Employee;

import java.util.List;

public interface Employeeservice {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
