package com.swift.bj.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class TempController {
    @GetMapping("")
    public String getMethodName() {
        return "Hello world";
    }
    
}
