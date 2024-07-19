package com.swift.bj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

/*
export class EmployeeModel {
    employeeId: number;
    employeeName: string;
    contactNo: string;
    emailId: string;
    deptId: number;
    password: string;
    gender: string;
    role: string;
    constructor() {
        this.deptId = 0;
        this.employeeId = 0;
        this.employeeName = '';
        this.contactNo = '';
        this.emailId = '';
        this.password = '';
        this.gender = '';
        this.role = '';
    }
}
 */
@Entity
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int employeeId;

    @ManyToOne
    private DepartmentModel department;

    private String employeeName;
    private String contactNo;
    private String emailId;
    private String employeePassword;
    private String gender;
    private String employeeRole;
    
    public EmployeeModel() {
    }
    
    public EmployeeModel(String employeeName, String contactNo, String emailId, String password, String gender, String role) {
        this.employeeName = employeeName;
        this.contactNo = contactNo;
        this.emailId = emailId;
        this.employeePassword = password;
        this.gender = gender;
        this.employeeRole = role;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String password) {
        this.employeePassword = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(String role) {
        this.employeeRole = role;
    }


    
}
