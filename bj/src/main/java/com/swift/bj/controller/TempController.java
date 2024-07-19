package com.swift.bj.controller;

import org.springframework.web.bind.annotation.RestController;

import com.swift.bj.model.APIResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


@RestController

public class TempController {
    @GetMapping("")
    public ResponseEntity<APIResponse> getMethodName() {
        ResponseEntity<APIResponse> response = ResponseEntity.ok().body(new APIResponse("User not found", false, null));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println(response);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        return response;
    }
    
}
