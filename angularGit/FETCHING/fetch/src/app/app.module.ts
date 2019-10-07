import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import{ HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { SportsComponent } from './sports/sports.component';
import { EntertainmentComponent } from './entertainment/entertainment.component';
import { BusinessComponent } from './business/business.component';
import { HealthComponent } from './health/health.component';
import { GeneralComponent } from './general/general.component';
import { TechnologyComponent } from './technology/technology.component';
import { HomeComponent } from './home/home.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    SportsComponent,
    EntertainmentComponent,
    BusinessComponent,
    HealthComponent,
    GeneralComponent,
    TechnologyComponent,
    HomeComponent,
    
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {
        path: '',component:HeaderComponent
      },
      {
        path: 'home',component:HomeComponent
      },
      {
        path: 'sports',component:SportsComponent
      },
      {
        path: 'entertainment',component:EntertainmentComponent
      },
      {
        path: 'business',component:BusinessComponent
      },
      {
        path: 'health',component:HealthComponent
      },
      {
        path: 'general',component:GeneralComponent
      },
      {
        path: 'technology',component:TechnologyComponent
      }
    ]),
    HttpClientModule
  ],
  
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
