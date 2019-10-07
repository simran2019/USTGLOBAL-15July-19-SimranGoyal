import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {

  bikeData: any='';
  constructor() { }


  sendDetail(bike){
    this.bikeData= bike;

  }

  bikes = [
    
     {
      brand: 'tower',
      img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQW8pKpcfnjzcr6kY9mfVwFV8ETjzfg--2XKQM2tW5eSKIZwvNMmQ',
      description: 'tower with light'
    },
    {
      brand: 'under water',
      img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQpQH10hEhJAm7-rdSZsNxrxO91We4wijdYNcGRoppjUO6HJ4Ox',
      description: 'image of under water'
    },
    {
      brand: 'colourful water',
      img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTja9KAsmwuUWwqWwDbC6KQjxU4eEwjLzdRSE9p9jnahZN4M7RkCg',
      description: 'sean in the water'
    },
    {
      brand: 'fish image',
      img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTzSiv1FUmF5QHtGrWtAGL0BniDSpdujFyhnvl_4TGY-18HmA8',
      description: 'marine mamale'
    },
   
    {
      brand: 'golden temple',
      img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSALqHxvWEW3Nl1LxPF9rtZHTZ720gvv-bNGAWVDV17Srtrvoic',
      description: 'golden temle image in panjab'
    },
    {
      brand: 'ship image',
      img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR1LUSnbz2gDaW9nI1jlRGTdax-fUh4HRA1GmnnZP7PYF6SPReuIw',
      description: 'ship in the ocean'
    },
    
  ]

  ngOnInit() {
  }

}