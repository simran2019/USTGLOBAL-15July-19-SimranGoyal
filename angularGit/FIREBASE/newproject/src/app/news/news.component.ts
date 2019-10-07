import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {
 
  indianNews: any[] = [];
  constructor(private http:HttpClient) { 
    http.get<any>('http://newsapi.org/v2/top-headlines?country=in&apiKey=c944805bb2ef41488be2d7847dd013dd').subscribe(resData =>{
    this.indianNews = resData.articles;
    console.log(this.indianNews);
  })
  }
  ngOnInit() {
  }

}
