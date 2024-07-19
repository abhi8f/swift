package com.swift.bj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.swift.bj.model.APIResponse;
import com.swift.bj.model.EmployeeModel;
import com.swift.bj.model.LoginModel;
import com.swift.bj.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public ResponseEntity<APIResponse> login(LoginModel loginData) {
        try {
            EmployeeModel employeedata = employeeRepository.findByEmailId(loginData.getEmailId());
            if (employeedata == null) {
                return ResponseEntity.badRequest().body(new APIResponse("User not found", false, null));
            }
            if (!employeedata.getEmployeePassword().equals(loginData.getPassword())) {
                return ResponseEntity.badRequest().body(new APIResponse("Incorrect password", false, null));
            }
            return ResponseEntity.ok(new APIResponse("Login successful", true, employeedata));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new APIResponse("Failed to login", false, null));
        }
    }


}
