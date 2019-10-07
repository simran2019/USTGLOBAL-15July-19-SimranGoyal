import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-logindetail',
  templateUrl: './logindetail.component.html',
  styleUrls: ['./logindetail.component.css']
})
export class LogindetailComponent implements OnInit {

  constructor(private service: UserService, private router: Router) { }

  selectedUser = {
    email: '',
    password: ''
  }


  deleteUser(user) {
    let u = this.service.Users.indexOf(user.email);
    this.service.Users.splice(u, 1);
  }




  editUser(user) {
    this.selectedUser = user;
    console.log(this.selectedUser)


  }

  updateForm(form) {
    let user = form.value;
    console.log(user);
    let index = this.service.Users.indexOf(user.email);
    this.service.Users.splice(index, 1, form.value);

  }

  ngOnInit() {
  }

}
