package com.swift.bj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swift.bj.model.EmployeeModel;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer> {
    EmployeeModel findByEmailId(String emailId);
}
