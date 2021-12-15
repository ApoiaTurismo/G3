import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { environment } from 'src/environments/environment.prod';
import { Categoria } from '../model/Categoria';
import { Produto } from '../model/Produto';
import { Usuario } from '../model/Usuario';
import { AuthService } from '../service/auth.service';
import { CategoriaService } from '../service/categoria.service';
import { ProdutoService } from '../service/produto.service';

@Component({
  selector: 'app-meusanuncios',
  templateUrl: './meusanuncios.component.html',
  styleUrls: ['./meusanuncios.component.css']
})
export class MeusanunciosComponent implements OnInit {

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
    private categoriaService: CategoriaService,
    private authService: AuthService
  ) { }

  ngOnInit() {

    this.getAllCategorias()
    this.getAllProdutos()
    this.getFindByIdUser()

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

  getFindByIdUser(): void{
    this.authService.getByIdUser(this.idUser).subscribe((resp: Usuario) => {
      this.usuario = resp
    })
  }

  findByIdCategoria(){
    this.categoriaService.getByIdCategoria(this.idCategoria).subscribe((resp: Categoria) => {
      this.categoria = resp
    })
  }

}
