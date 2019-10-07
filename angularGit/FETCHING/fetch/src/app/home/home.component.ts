import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  Technology:any[]=[];
  General:any[]=[];
  Sports:any[]=[];

  constructor(private http:HttpClient) {
    http.get<any>('https://newsapi.org/v2/top-headlines?country=us&category=general&apiKey=c944805bb2ef41488be2d7847dd013dd').subscribe((resData)=>{
      this.General=resData.articles;
      console.log(this.General)
  })
  http.get<any>('https://newsapi.org/v2/top-headlines?country=us&category=technology&apiKey=c944805bb2ef41488be2d7847dd013dd').subscribe((resData)=>{
    this.Technology=resData.articles;
    console.log(this.Technology);
  })
  http.get<any>('https://newsapi.org/v2/top-headlines?country=us&category=sports&apiKey=c944805bb2ef41488be2d7847dd013dd').subscribe((resData)=>{
    this.Sports=resData.articles;
    console.log(this.Sports);
  })
}

  ngOnInit() {
  }

}
