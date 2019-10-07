import { Injectable } from '@angular/core';
import {HttpClient } from '@angular/common/http'
import { User } from './car-display/user';
import {map } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class FirebaseService {


   selectedUser: User = {
    Model : null,
    Brand: null,
    yearofrelease: null,
    unitssold: null,
    cost: null
   }
url:string='https://angular-cars-48ba5.firebaseio.com/'
  constructor(private http:HttpClient) {

   }
  
  users:any =[];

  // getData(){
  //   this.http.get(`${this.url}users.json`).subscribe(data=>{
  //     this.users = data;
  //   }, err=>{
  // console.log(err);
  //   });
  // }
  

  getData(){
    return this.http.get(`${this.url}/users.json`).pipe(map(resData=>{
      let usersArray=[];
      for(let key in resData)
      {
        usersArray.push({...resData[key],id:key})
      }
      return usersArray;
      
    }))
    .subscribe(data=>{
      this.users = data;
    }, err=>{
  console.log(err);
    });
  }
  


  postData(data){
    return this.http.post(`${this.url}/users.json`,data);
  }
  updateData(data){
    return this.http.put(`${this.url}users/${data.id}.json`,data);
  }

  deleteData(data){
    return this.http.delete(`${this.url}users/${data.id}.json`)
  }
}
