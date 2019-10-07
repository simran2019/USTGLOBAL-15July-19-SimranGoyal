import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { TaskserviceService } from '../taskservice.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-task',
  templateUrl: './add-task.component.html',
  styleUrls: ['./add-task.component.css']
})
export class AddTaskComponent implements OnInit {

  constructor(private http:HttpClient , private service:TaskserviceService , private router:Router) { }

  addtask(form:NgForm){
this.service.sendData(form.value).subscribe(resdata=>{
  console.log(resdata);
  form.reset();

  this.router.navigateByUrl('/show');
},err=>{
  console.log(err)
})
  }

  ngOnInit() {
  }

}
