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
    TodasCategoriasComponent
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
