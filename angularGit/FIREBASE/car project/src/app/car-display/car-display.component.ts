import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-car-display',
  templateUrl: './car-display.component.html',
  styleUrls: ['./car-display.component.css']
})
export class CarDisplayComponent implements OnInit {

  constructor(private firebaseService: FirebaseService,private router: Router) { }

  updateUser(user){
    this.firebaseService.selectedUser = user;
    this.router.navigateByUrl('/firebase');
  
  }  
  deleteUser(user){
    this.firebaseService.deleteData(user).subscribe(resData=>{
      console.log(resData);
       this.firebaseService.getData();
    })
  }

  ngOnInit() {
    this.firebaseService.getData();
    console.log(this.firebaseService.users);
  }

}
