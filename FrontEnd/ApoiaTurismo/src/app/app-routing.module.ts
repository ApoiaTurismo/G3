import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CadastrarComponent } from './cadastrar/cadastrar.component';
import { EntrarComponent } from './entrar/entrar.component';
import { InicioComponent } from './inicio/inicio.component';
import { MenuComponent } from './menu/menu.component';
import { TodasCategoriasComponent } from './todas-categorias/todas-categorias.component';

const routes: Routes = [

  {path:'', redirectTo: 'inicio', pathMatch: 'full'},

  {path:'entrar', component:EntrarComponent},
  {path:'menu', component:MenuComponent},
  {path:'cadastrar', component:CadastrarComponent},
  {path:'entrar', component:EntrarComponent},
  {path:'inicio', component:InicioComponent},
  {path:'todascategorias', component:TodasCategoriasComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
