import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TaskserviceService {

taskinfo:any[]=[];

sendData(data){
  return this.http.post('http://localhost:4041/task/add',data);
}

getData(){
  return this.http.get('http://localhost:4041/task/get-all').subscribe(resdata=>{
    this.taskinfo = resdata.tasks;
    console.log(this.taskinfo);
  },err=>{
    console.log(err);
  })
}

updateData(data){
  return this.http.put(`http://localhost:4041/task/modify`,data);
}

deleteData(data){
  return this.http.delete(`http://localhost:4041/task/remove/${data}`,data);
}

  constructor(private http:HttpClient) { }
}
