import { Component, OnInit } from '@angular/core';
import { FirebseService } from '../firebse.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private firebaseService:FirebseService) { }

  ngOnInit() {
  this.firebaseService.getData();
  }

}
