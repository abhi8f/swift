package com.swift.bj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swift.bj.model.APIResponse;
import com.swift.bj.model.LoginModel;
import com.swift.bj.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/login")
    public ResponseEntity<APIResponse> login(@RequestBody LoginModel loginData) {
        ResponseEntity<APIResponse> response = employeeService.login(loginData);
        //print response
        System.out.println(response);
        return response;
    }
    
}
