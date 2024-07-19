package com.swift.bj.model;

public class LoginModel {

    private String emailId;
    private String password;

    
    public LoginModel() {
    }
    
    public LoginModel(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    
}
