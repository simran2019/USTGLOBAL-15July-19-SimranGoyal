import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule} from '@angular/router'

import { AppComponent } from './app.component';
import { CarshowComponent } from './carshow/carshow.component';
import { CarchildComponent } from './carchild/carchild.component';
import { HeaderComponent } from './header/header.component';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
    CarshowComponent,
    CarchildComponent,
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path:'',component:HeaderComponent},
      {path:'carshow',component:CarshowComponent},
      {path:'carchild',component:CarchildComponent}
    ]),HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
