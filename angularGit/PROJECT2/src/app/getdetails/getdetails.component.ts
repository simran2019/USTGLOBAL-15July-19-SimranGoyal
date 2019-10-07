import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-getdetails',
  templateUrl: './getdetails.component.html',
  styleUrls: ['./getdetails.component.css']
})
export class GetdetailsComponent implements OnInit {

url:string = 'https://api.github.com/users';

  user=[];
  constructor(private http:HttpClient) {



    http.get<any>(`https://api.github.com/users`).subscribe(data=>{
      this.user = data;
      console.log(this.user);
    })
   }


   // for delete the data

   delete(info){
     let index = this.user.indexOf(info);
     this.user.splice(index, 1);
   }
  
  
   


  ngOnInit() {
  }
}
