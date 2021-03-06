import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment.prod';
import { Produto } from '../model/Produto';

@Injectable({
  providedIn: 'root'
})
export class ProdutoService {

  constructor(
    private http: HttpClient
  ) { }

  token = {
    headers: new HttpHeaders().set('authorization', environment.token)
  }

  getAllProdutos(): Observable<Produto[]>{
    return this.http.get<Produto[]>('https://apoiaturismo.herokuapp.com/produtos', this.token)
  }

  getByIdProduto(id: number): Observable<Produto>{
    return this.http.get<Produto>(`https://apoiaturismo.herokuapp.com/produtos/${id}`, this.token)
  }

  postProduto(produto: Produto): Observable<Produto>{
    return this.http.post<Produto>('https://apoiaturismo.herokuapp.com/produtos', produto, this.token)
  }

  putProduto(produto: Produto): Observable<Produto>{
    return this.http.put<Produto>('https://apoiaturismo.herokuapp.com/produtos', produto, this.token)
  }

  deleteProduto(id: number){
    return this.http.delete(`https://apoiaturismo.herokuapp.com/produtos/${id}`, this.token)
  }

  getByTituloProduto(titulo : string):Observable<Produto[]>{
    return this.http.get<Produto[]>(`https://apoiaturismo.herokuapp.com/produtos/titulo/${titulo}`, this.token)
  }



}
