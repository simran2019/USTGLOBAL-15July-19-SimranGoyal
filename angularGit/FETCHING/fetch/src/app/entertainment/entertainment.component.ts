import { Component, OnInit } from '@angular/core';
import { HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-entertainment',
  templateUrl: './entertainment.component.html',
  styleUrls: ['./entertainment.component.css']
})
export class EntertainmentComponent implements OnInit {

  Entertainment:any[]=[];
  constructor(private http:HttpClient) {
    http.get<any>('https://newsapi.org/v2/top-headlines?country=us&category=entertainment&apiKey=c944805bb2ef41488be2d7847dd013dd').subscribe((resData)=>{

this.Entertainment=resData.articles;
console.log(this.Entertainment);

    })
   }

  ngOnInit() {
  }

}
