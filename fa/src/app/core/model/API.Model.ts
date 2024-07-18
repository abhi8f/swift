export interface APIResponse {
    message: string;
    result: boolean;
    data: any;
}

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

export class LoginModel {
    emailId: string;
    password: string;
    constructor() {
        this.emailId = '';
        this.password = '';
    }
}

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