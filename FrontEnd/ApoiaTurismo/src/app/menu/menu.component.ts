import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { environment } from 'src/environments/environment.prod';
import { InicioComponent } from '../inicio/inicio.component';
import { Produto } from '../model/Produto';
import { CategoriaService } from '../service/categoria.service';
import { ProdutoService } from '../service/produto.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  nick = environment.nick
  foto = environment.foto
  id = environment.id
  tituloProduto: string
  titulo: string

  constructor(
    private router: Router,
    private produtoService: ProdutoService,
    private categoriaService: CategoriaService
  ) { }

  ngOnInit() {

  }

  logado(){
    if(environment.token != ''){
      return true
    }

    return false
  }

  sair(){
    environment.token = ''
    environment.nome = ''
    environment.foto = ''
    environment.id = 0
    this.router.navigate(['/inicio'])
  }

  pesquisar(){
    this.titulo = (document.getElementById('caixaPesquisa') as HTMLInputElement).value
    if(this.titulo == '') this.router.navigate(['/inicio'])
    this.router.navigate(['/pesquisa/' + this.titulo])
  }

  sendTituloProduto(){
    var titulo = (document.getElementById('caixaPesquisa') as HTMLInputElement).value
    console.log(titulo)
    if(titulo){
      let inicioComponent = new InicioComponent(this.router, this.produtoService, this.categoriaService)

      inicioComponent.findByTituloProduto(titulo)
    }
  }

  scrollToQuemSomos(){
    document.querySelector('#quemsomos')?.scrollIntoView({ behavior: 'smooth', block: 'center' })
  }

  enableDarkMode(){
    document.body.classList.remove('bg-light')

    document.body.classList.add('bg-dark','text-light')


    const jumbo = document.getElementById('quemsomos')
    console.log(jumbo)
    if(jumbo){
      jumbo.classList.remove('bg-light')
      jumbo.classList.add('bg-dark')
    }

    const card = document.getElementsByClassName('card')
    console.log(card)
    if(card){
      for(var i = 0; i < card.length; i++){
        card[i].classList.remove('bg-light')
        card[i].classList.add('bg-dark')
      }
    }


    const categorias = document.getElementById('#barraCategorias')
    if(categorias){
      categorias.classList.remove('text-light')
      categorias.classList.add('text-black')
      categorias.classList.add('bg-light')
    }

  }



}
