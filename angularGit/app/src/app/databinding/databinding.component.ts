import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-databinding',
  templateUrl: './databinding.component.html',
  styleUrls: ['./databinding.component.css']
})
export class DatabindingComponent implements OnInit {
  isApply = false;
  name= "simran";
  color = "red";
  search = "";
  bgcolor = "pink";

  printAlert(){
    alert("hello how are you");
    }

  constructor() {

    setTimeout(() => {
    this.isApply = true;
    }, 2000);

    setInterval(()=>{
      this.isApply =!this.isApply;
    },2000);
   }

  ngOnInit() {
  }

}
