import { Component, OnInit } from '@angular/core';
import { FirebseService } from '../firebse.service';
import { NgForm } from '@angular/forms';
import {Router} from '@angular/router'

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  constructor(private firebaseService:FirebseService,private router:Router) { }

  postProduct(UserForm){
    this.firebaseService.postData(UserForm.value).subscribe(resData=>{
      console.log(resData);
      UserForm.reset();
    },err=>{
      console.log(err);
    })
  }

  ngOnInit() {
  }

}
