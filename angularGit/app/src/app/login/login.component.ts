import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private service  : UserService) { }

  ngOnInit() {
  }

LoginForm(form){
  console.log(form.value);
  this.service.Users.push(form.value);
}

}
