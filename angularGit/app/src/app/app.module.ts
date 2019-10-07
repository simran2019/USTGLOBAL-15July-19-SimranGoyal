import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { DatabindingComponent } from './databinding/databinding.component';
import { LoginComponent } from './login/login.component';
import { LogindetailComponent } from './logindetail/logindetail.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    DatabindingComponent,
    LoginComponent,
    LogindetailComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path:'binding' , component:DatabindingComponent},
      {path:'login' , component:LoginComponent},
      {path:'logindetail' , component:LogindetailComponent}
    ]),
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
