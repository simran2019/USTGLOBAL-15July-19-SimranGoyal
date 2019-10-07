import { Component, OnInit, OnDestroy } from '@angular/core';
import { UserService } from '../user.service';
// import { interval, Subscription } from 'rxjs';
import { map } from "rxjs/operators";

@Component({
  selector: 'app-observables',
  templateUrl: './observables.component.html',
  styleUrls: ['./observables.component.css']
})
export class ObservablesComponent implements OnInit{

  constructor(private userServices: UserService) { }

  // mySubscription: Subscription;
  



  ngOnInit() {

this.userServices.printDetails()

  }


// this.mySubscription = interval(1000).pipe(map(data=>{
//   return data*10;
// })).subscribe(data=>{
// console.log(data);
//     }, err=>{
//       console.log(err);

//     },()=>{

//     console.log('subscription complete')
//   });


//     interval(1000).subscribe(data=>{
// console.log(data);
//     }, err=>{
//       console.log(err);

//     },()=>{

//     console.log('subscription complete')
//   });
// }


//  this.mySubscription = interval(1000).subscribe(data=>{
//   console.log(data);
//       }, err=>{
//         console.log(err);
  
//       },()=>{
  
//       console.log('subscription complete')
//     });
  // }


ngOnDesTroy(){
// // this.mySubscription.unsubscribe();
}
}