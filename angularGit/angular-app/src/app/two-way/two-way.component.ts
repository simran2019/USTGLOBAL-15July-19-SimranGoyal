import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-two-way',
  templateUrl: './two-way.component.html',
  styleUrls: ['./two-way.component.css']
})

export class TwoWayComponent implements OnInit {
  backgroundColor = 'blue';
 
  buttonEvent(data){      
    console.log(data);

  }
  changeColor(data){
    this.backgroundColor = 'red';
    //  this.backgroundColor = data ; 
  }

  constructor() { 
    console.log('constructor running');
  }

  ngOnInit() : void{
    console.log('ngOninit imlemented');
  }
}
