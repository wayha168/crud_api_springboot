package com.practice.crud_api.service;

import java.util.List;

import com.practice.crud_api.dto.EmployeeDto;

public interface EmployeeService {
    
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);

    void deleteEmployee(Long employeeId);

}
