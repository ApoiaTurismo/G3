import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CadastrarComponent } from './cadastrar/cadastrar.component';
import { ProdutoDeleteComponent } from './delete/produto-delete/produto-delete.component';
import { ProdutoEditComponent } from './edit/produto-edit/produto-edit.component';
import { EntrarComponent } from './entrar/entrar.component';
import { InicioComponent } from './inicio/inicio.component';
import { MenuComponent } from './menu/menu.component';
import { MeusanunciosComponent } from './meusanuncios/meusanuncios.component';
import { TodasCategoriasComponent } from './todas-categorias/todas-categorias.component';

const routes: Routes = [

  {path:'', redirectTo: 'inicio', pathMatch: 'full'},

  {path:'entrar', component:EntrarComponent},
  {path:'menu', component:MenuComponent},
  {path:'cadastrar', component:CadastrarComponent},
  {path:'entrar', component:EntrarComponent},
  {path:'inicio', component:InicioComponent},
  {path:'todascategorias', component:TodasCategoriasComponent},
  {path:'meusanuncios', component:MeusanunciosComponent},

  {path:'produto-edit/:id', component:ProdutoEditComponent},
  {path:'produto-delete/:id', component:ProdutoDeleteComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
