package com.swift.bj.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


/*
export class Department {
    deptId: number;
    deptName: string;
    deptHeadEmpId: number;
    createdDate: Date;

    constructor() {
        this.createdDate = new Date();
        this.deptHeadEmpId = 0;
        this.deptId = 0;
        this.deptName = ''; 
    }
}
 */
@Entity
public class DepartmentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int deptId;
    private String deptName;
    private int deptHeadEmpId;
    private Date createdDate;

    public DepartmentModel() {
    }

    public DepartmentModel(String deptName, int deptHeadEmpId, Date createdDate) {
        this.deptName = deptName;
        this.deptHeadEmpId = deptHeadEmpId;
        this.createdDate = createdDate;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getDeptHeadEmpId() {
        return deptHeadEmpId;
    }

    public void setDeptHeadEmpId(int deptHeadEmpId) {
        this.deptHeadEmpId = deptHeadEmpId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}