import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directives',
  templateUrl: './directives.component.html',
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent implements OnInit {
  // condition=false;

  constructor() { }
  removeUser(user){
    let index = this.users.indexOf(user);
    this.users.splice(index, 1);
    // this.condition= true;
  }
users = [
  {
    id:1234,
    name: 'simran',
    city: 'agra'
  },
  {
    id:2345,
    name: 'simu',
    city: 'mumbai',
  },
  {
    id:3456,
    name: 'gjj',
    city: 'vhjv'
  },
  {
    id:67864,
    name: 'dfjkk',
    city: 'kjhrkf',

  },
  {
    id:4876,
    name: 'chini',
    city: 'china'
  }
]
  ngOnInit() {
  }

}

