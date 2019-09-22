import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-carshow',
  templateUrl: './carshow.component.html',
  styleUrls: ['./carshow.component.css']
})
export class CarshowComponent implements OnInit {

  constructor(private http: HttpClient) { }

  info: any[] = [];

  sendDetails(car) {
    this.info = car;

  }


  Car = [
    {
      image: 'https://image.shutterstock.com/image-photo/cars-sale-stock-row-car-260nw-636632101.jpg',
      description: 'cars in row'
    },
    {
      image: 'https://cdn.pixabay.com/photo/2016/02/13/13/11/cuba-1197800__340.jpg',
      description: 'old fashion cars'
    },
    {
      image: 'https://cdn.pixabay.com/photo/2012/11/02/13/02/ford-63930__340.jpg',
      description: 'fourd moul car'
    }
  ]


  ngOnInit() {
  }

}
