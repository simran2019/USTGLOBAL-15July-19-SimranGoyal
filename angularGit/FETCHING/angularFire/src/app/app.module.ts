import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GithubComponent } from './github/github.component';
import { HeaderComponent } from './header/header.component';
import { TypicodeComponent } from './typicode/typicode.component';

@NgModule({
  declarations: [
    AppComponent,
    GithubComponent,
    HeaderComponent,
    TypicodeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
