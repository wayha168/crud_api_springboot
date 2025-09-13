package com.practice.crud_api.service.impl;

import org.springframework.stereotype.Service;

import com.practice.crud_api.dto.EmployeeDto;
import com.practice.crud_api.entity.Employee;
import com.practice.crud_api.mapper.EmployeeMapper;
import com.practice.crud_api.repository.EmployeeRepository;
import com.practice.crud_api.service.EmployeeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

}
