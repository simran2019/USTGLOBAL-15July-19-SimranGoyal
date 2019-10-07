import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-technology',
  templateUrl: './technology.component.html',
  styleUrls: ['./technology.component.css']
})
export class TechnologyComponent implements OnInit {

  Technology:any[]=[];
  constructor(private http:HttpClient) {
    http.get<any>('https://newsapi.org/v2/top-headlines?country=us&category=technology&apiKey=c944805bb2ef41488be2d7847dd013dd').subscribe((resData)=>{
      this.Technology=resData.articles;
      console.log(this.Technology);
    })
   }

  ngOnInit() {
  }

}
