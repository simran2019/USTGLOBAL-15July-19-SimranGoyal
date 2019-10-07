import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { TaskserviceService } from '../taskservice.service';

@Component({
  selector: 'app-edit-task',
  templateUrl: './edit-task.component.html',
  styleUrls: ['./edit-task.component.css']
})
export class EditTaskComponent implements OnInit {

  constructor(private router:Router , private service:TaskserviceService) { }


  deleteTask(task){
    this.service.deleteData(task).subscribe(data=>{
      console.log(data);
      this.router.navigateByUrl("/show");
    })
  }
  updateTask(task) {
    this.service.updateData(task).subscribe(data=>{
      console.log(data);
      this.router.navigateByUrl("/show");
    })
  }
  ngOnInit() {
  }

}
