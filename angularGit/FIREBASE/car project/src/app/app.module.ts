import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms'


import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { CarEntryComponent } from './car-entry/car-entry.component';
import { CarDisplayComponent } from './car-display/car-display.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    CarEntryComponent,
    CarDisplayComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path:'',component:HeaderComponent},
      {path:'carentry' ,component:CarEntryComponent},
      {path:'cardisplay',component:CarDisplayComponent}
    ]),
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
