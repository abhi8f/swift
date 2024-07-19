import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { APIResponse, LoginModel } from '../model/API.Model';
import { environment } from '../../../environments/environment';
import { Constant } from '../constant/Constant';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  
  constructor(private http: HttpClient) { }
  
  
  login(loginObj: LoginModel) {
    this.http.get<APIResponse>('http://localhost:8080/').subscribe(apiData => {
      console.log(apiData);
    });
  }
}
