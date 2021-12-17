import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Categoria } from '../model/Categoria';
import { Produto } from '../model/Produto';
import { ProdutoService } from '../service/produto.service';

@Component({
  selector: 'app-pesquisa',
  templateUrl: './pesquisa.component.html',
  styleUrls: ['./pesquisa.component.css']
})
export class PesquisaComponent implements OnInit {

  produto: Produto = new Produto()
  categoria: Categoria = new Categoria()
  listaProdutos: Produto[]
  titulo: string
  id: number

  constructor(
    private route: ActivatedRoute,
    private produtoService: ProdutoService,
    private router: Router
  ) {
    this.router.routeReuseStrategy.shouldReuseRoute = () => false;
  }

  ngOnInit() {

    this.titulo = this.route.snapshot.params['s']

    this.findByTituloProduto(this.titulo)

    console.log('valor na url: '+ this.titulo)
  }

  findByTituloProduto(titulo: string){
    this.produtoService.getByTituloProduto(titulo).subscribe((resp: Produto[]) => {
      this.listaProdutos = resp
      console.log(this.listaProdutos)
    })
  }

}
