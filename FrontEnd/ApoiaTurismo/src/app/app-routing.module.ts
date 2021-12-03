import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EntrarComponent } from './entrar/entrar.component';
import { MenuComponent } from './menu/menu.component';

const routes: Routes = [

  {path:'', redirectTo: 'menu', pathMatch: 'full'},

  {path:'entrar', component:EntrarComponent},
  {path:'menu', component:MenuComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
