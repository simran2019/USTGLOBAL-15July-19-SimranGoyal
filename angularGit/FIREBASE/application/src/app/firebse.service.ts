import { Injectable } from '@angular/core';
import {HttpClient } from '@angular/common/http'
import { Product } from './product-details/user';
import{ map } from 'rxjs/operators'
 
@Injectable({
  providedIn: 'root'
})
export class FirebseService {
  


  selectedUser: Product = {
    img : null,
    Details: null,
    Discription : null,
   
   }

url: string='https://product-93ea6.firebaseio.com/';


  users:any =[];

postData(data){
  return this.http.post(`${this.url}/users.json`,data);
}

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


updateData(data){
  return this.http.put(`${this.url}users/${data.id}.json`,data);
}

deleteData(data){
  return this.http.delete(`${this.url}users/${data.id}.json`)
}

ngDoCheck(){
  this.getData();
}


  constructor(private http:HttpClient) { }
}
