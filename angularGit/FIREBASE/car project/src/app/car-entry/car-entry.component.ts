import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
// import { from } from 'rxjs';

@Component({
  selector: 'app-car-entry',
  templateUrl: './car-entry.component.html',
  styleUrls: ['./car-entry.component.css']
})
export class CarEntryComponent implements OnInit {

  constructor(private firebaseService:FirebaseService,private router:Router) { }

  postUser(UserForm:NgForm){
  this.firebaseService.postData(UserForm.value).subscribe(resData=>{
    console.log(resData);
    UserForm.reset();
  },err=>{
    console.log(err);
  });
}



  ngOnInit() {
  }

}
