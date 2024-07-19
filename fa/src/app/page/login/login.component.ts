import { Component, inject } from '@angular/core';
import { APIResponse, LoginModel } from '../../core/model/API.Model';
import { FormsModule } from '@angular/forms';
import { EmployeeService } from '../../core/service/employee.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  loginObj: LoginModel = new LoginModel();

  #empService = inject(EmployeeService);
  #router = inject(Router);

  onLogin() {
    this.#empService.login(this.loginObj).subscribe(apiData => {

      if (apiData.result) {
        localStorage.setItem('ticketData', JSON.stringify(apiData.data));
        this.#router.navigateByUrl('/dashboard');
      }
    });;
  }
}
