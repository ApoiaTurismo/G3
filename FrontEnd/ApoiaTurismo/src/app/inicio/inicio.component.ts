import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { environment } from 'src/environments/environment.prod';
import { Categoria } from '../model/Categoria';
import { Produto } from '../model/Produto';
import { Usuario } from '../model/Usuario';
import { CategoriaService } from '../service/categoria.service';
import { ProdutoService } from '../service/produto.service';

@Component({
  selector: 'app-inicio',
  templateUrl: './inicio.component.html',
  styleUrls: ['./inicio.component.css']
})
export class InicioComponent implements OnInit {

  produto: Produto = new Produto()
  categoria: Categoria = new Categoria()
  idCategoria: number
  listaCategorias: Categoria[]
  listaProdutos: Produto[]

  usuario: Usuario = new Usuario()
  idUser = environment.id

  constructor(
    private router: Router,
    private produtoService: ProdutoService,
    private categoriaService: CategoriaService
  ) { }

  ngOnInit() {

    this.getAllCategorias()
    this.getAllProdutos()

  }

  logado(){
    if(environment.token != ''){
      return true
    }
    return false
  }

  getAllCategorias(){
    this.categoriaService.getAllCategoria().subscribe((resp: Categoria[]) => {
      this.listaCategorias = resp
    })
  }

  getAllProdutos(){
    this.produtoService.getAllProdutos().subscribe((resp: Produto[]) => {
      this.listaProdutos = resp
    })
  }

  findByIdCategoria(){
    this.categoriaService.getByIdCategoria(this.idCategoria).subscribe((resp: Categoria) => {
      this.categoria = resp
    })
  }

  publicar(){
    this.categoria.idCategoria = this.idCategoria
    this.produto.categoria = this.categoria

    this.usuario.idUsuario = this.idUser
    this.produto.usuario = this.usuario

    this.produtoService.postProduto(this.produto).subscribe((resp: Produto) => {
      this.produto = resp
      alert('Anuncio feito com sucesso!')
      this.ngOnInit()
      this.produto = new Produto()
    })
  }

}
