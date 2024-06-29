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

  login(obj: LoginModel): Observable<APIResponse> {
    return this.http.post<APIResponse>(environment.API_URL + Constant.API_END_POINT.LOGIN,obj);
  }
}
