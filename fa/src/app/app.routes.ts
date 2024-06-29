import { Routes } from '@angular/router';
import { LoginComponent } from './page/login/login.component';
import { LayoutComponent } from './page/layout/layout.component';
import { DashboardComponent } from './page/dashboard/dashboard.component';
import { EmployeeComponent } from './page/employee/employee.component';
import { DepartmentComponent } from './page/department/department.component';
import { TicketComponent } from './page/ticket/ticket.component';
import { NewTicketComponent } from './page/new-ticket/new-ticket.component';

export const routes: Routes = [
    {
        path: '',
        redirectTo: 'login',
        pathMatch: 'full'
    },
    {
        path: 'login',
        component: LoginComponent
    },
    {
        path: '',
        component: LayoutComponent,
        children: [
            {
                path: 'dashboard',
                component: DashboardComponent
            },
            {
                path: 'employee',
                component: EmployeeComponent
            },
            {
                path: 'department',
                component: DepartmentComponent
            },
            {
                path: 'ticket',
                component: TicketComponent
            },
            {
                path: 'new-ticket',
                component: NewTicketComponent
            }
        ]
    }
];
