package com.practice.crud_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.crud_api.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
