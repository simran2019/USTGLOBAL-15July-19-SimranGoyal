import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-sports',
  templateUrl: './sports.component.html',
  styleUrls: ['./sports.component.css']
})
export class SportsComponent implements OnInit {

  Sports:any[]=[];
  constructor(private http:HttpClient) {
    http.get<any>('https://newsapi.org/v2/top-headlines?country=us&category=sports&apiKey=c944805bb2ef41488be2d7847dd013dd').subscribe((resData)=>{
      this.Sports=resData.articles;
      console.log(this.Sports);
    })
   }

  ngOnInit() {
  }

}
