import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent implements OnInit {

  constructor() { }

  users=[];
 printForm(loginForm){
   this.users.push(loginForm.value);
   console.log(this.users);
 }
 delete(user){
   let index = this.users.indexOf(user);
   this.users.splice(index,1);
 }


  // printForm(loginForm,username,password){
  //   console.log(loginForm,username,password);
    
  // }

  ngOnInit() {
  }

}
