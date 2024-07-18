import { CommonModule } from '@angular/common';
import { Component, HostListener } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { EmployeeModel } from '../../core/model/API.Model';

@Component({
  selector: 'app-layout',
  standalone: true,
  imports: [RouterOutlet, CommonModule, RouterLink],
  templateUrl: './layout.component.html',
  styleUrl: './layout.component.css'
})
export class LayoutComponent {
  sidebarOpen = false;

  toggleSidebar() {
    this.sidebarOpen = !this.sidebarOpen;
  }
  @HostListener('document:click', ['$event'])
  onDocumentClick(event: MouseEvent) {
    const target = event.target as HTMLElement;
    if (target && !target.closest('#separator-sidebar') && !target.closest('button')) {
      this.sidebarOpen = false;
    }
  }

  loggedData: EmployeeModel | undefined;

  constructor() {
    const localData = localStorage.getItem('ticketData');
    if (localData) {
      this.loggedData = JSON.parse(localData);
    }
  }

}
