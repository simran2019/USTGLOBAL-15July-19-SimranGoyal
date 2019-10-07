import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-business',
  templateUrl: './business.component.html',
  styleUrls: ['./business.component.css']
})
export class BusinessComponent implements OnInit {

  Business:any[]=[];

  constructor(private http:HttpClient) { 

    http.get<any>('https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=c944805bb2ef41488be2d7847dd013dd').subscribe(resData =>{
      this.Business = resData.articles;
    console.log(this.Business);
  })
}

  ngOnInit() {
  }

}
