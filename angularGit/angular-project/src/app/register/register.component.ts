import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { CustomValidator } from './custom.validator';



@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor() { }



get username(){
  return this.registerForm.get('username');
}

get phno(){
  return this.registerForm.get('phno');
}

get email(){
  return this.registerForm.get('email');
}
get password(){
  return this.registerForm.get('password');
}



registerForm = new FormGroup({ 
  username : new FormControl('',[Validators.minLength(4),
  Validators.required]),

  phno : new FormControl('',[Validators.minLength(10),Validators.required]),

  email : new FormControl ('', [Validators.email,Validators.minLength(5),
                                 Validators.required , 
                                 CustomValidator.noSpace]),

  password : new FormControl('',[Validators.minLength(6),Validators.required]),
});


printForm(registerForm){
  console.log(this.registerForm.value);
  registerForm.reset();

}


  ngOnInit() {
  }

}
