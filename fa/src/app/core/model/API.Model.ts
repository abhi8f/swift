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