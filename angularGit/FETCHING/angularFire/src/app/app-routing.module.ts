import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { GithubComponent } from './github/github.component';
import { TypicodeComponent } from './typicode/typicode.component';
import { HttpClientModule } from '@angular/common/http';


const routes: Routes = [
  {path:'' ,component:HeaderComponent},
  {path:'github' ,component:GithubComponent},
  {path:'typicode' , component:TypicodeComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes),HttpClientModule],
  exports: [RouterModule]
})
export class AppRoutingModule { }
