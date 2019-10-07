import { Component, OnInit } from '@angular/core';
import { HttpClient} from '@angular/common/http'

@Component({
  selector: 'app-health',
  templateUrl: './health.component.html',
  styleUrls: ['./health.component.css']
})
export class HealthComponent implements OnInit {

  Health:any[]=[];

  constructor(private http:HttpClient) {
    http.get<any>('https://newsapi.org/v2/top-headlines?country=us&category=health&apiKey=c944805bb2ef41488be2d7847dd013dd').subscribe((resData)=>{
      this.Health=resData.articles;
      console.log(this.Health);
    })
   }

  ngOnInit() {
  }

}
