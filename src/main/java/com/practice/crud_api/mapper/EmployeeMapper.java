package com.practice.crud_api.mapper;

import com.practice.crud_api.dto.EmployeeDto;
import com.practice.crud_api.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(
            employee.getId(),
            employee.getFirstname(),
            employee.getLastname(),
            employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto) {
        return new Employee(
            employeeDto.getId(),
            employeeDto.getFirstName(),
            employeeDto.getLastName(),
            employeeDto.getEmail()
        );
    }

}
