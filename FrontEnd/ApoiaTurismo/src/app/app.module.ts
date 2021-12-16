import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuComponent } from './menu/menu.component';
import { RodapeComponent } from './rodape/rodape.component';
import { ContatoComponent } from './contato/contato.component';
import { CategoriasComponent } from './categorias/categorias.component';
import { SobrenosComponent } from './sobrenos/sobrenos.component';
import { EntrarComponent } from './entrar/entrar.component';
import { CadastrarComponent } from './cadastrar/cadastrar.component';
import { FormsModule } from '@angular/forms';
import { InicioComponent } from './inicio/inicio.component';
import { TodasCategoriasComponent } from './todas-categorias/todas-categorias.component';
import { MeusanunciosComponent } from './meusanuncios/meusanuncios.component';
import { ProdutoEditComponent } from './edit/produto-edit/produto-edit.component';
import { ProdutoDeleteComponent } from './delete/produto-delete/produto-delete.component';
import { UserEditComponent } from './edit/user-edit/user-edit.component';
import { CategoriaComponent } from './categoria/categoria.component';
import { PesquisaComponent } from './pesquisa/pesquisa.component';

@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    RodapeComponent,
    ContatoComponent,
    CategoriasComponent,
    SobrenosComponent,
    EntrarComponent,
    CadastrarComponent,
    InicioComponent,
    TodasCategoriasComponent,
    MeusanunciosComponent,
    ProdutoEditComponent,
    ProdutoDeleteComponent,
    UserEditComponent,
    CategoriaComponent,
    PesquisaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
