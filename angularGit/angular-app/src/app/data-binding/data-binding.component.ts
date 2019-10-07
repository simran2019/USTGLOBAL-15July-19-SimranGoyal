import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent  {
  redcolor = true
  name = 'simran';
  textClasses = 'bg-success text-white';
   paragraphStyle = 'purple';
   isApplude = false;
  padding = '50px';
  columnSpan = '2';
  
  imgUrl= "https://cdn.pixabay.com/photo/2015/06/25/17/56/people-821624__340.jpg"

  constructor() {
    setTimeout(()=> {
    this.redcolor = false;
   
   },5000);

  }


}
