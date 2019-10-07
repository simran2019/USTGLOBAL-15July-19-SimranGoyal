import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClientModule} from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class FirebaseService {



  constructor(private http:HttpClientModule , private router:Router) { }







}
