import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';



@Component({
  selector: 'app-firebase',
  templateUrl: './firebase.component.html',
  styleUrls: ['./firebase.component.css']
})
export class FirebaseComponent implements OnInit {

  constructor(private firebaseService: FirebaseService, private router: Router) { }


  postUser(UserForm :NgForm){
    if(UserForm.value.id){
      this.firebaseService.updateData(UserForm.value).subscribe((data)=>{
        console.log(data);
        
        this.firebaseService.getData();
        UserForm.reset();
        this.router.navigateByUrl('/users')
      },err=>{
        console.log(err);
      })
    }else(
    this.firebaseService.postData(UserForm.value).subscribe((data)=>{
      console.log(data);
     this.firebaseService.getData();
      UserForm.reset();
      this.router.navigateByUrl('/users')
    },err=>{
      console.log(err);
     }))
    }

  ngOnInit() {
  }

}
