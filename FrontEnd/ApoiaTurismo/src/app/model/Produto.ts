import { Categoria } from "./Categoria"
import { Usuario } from "./Usuario"

export class Produto{
  public idProduto: number
  public titulo: string
  public descricaoProduto: string
  public fotoUrl: string
  public regiao: string
  public preco: number
  public categoria: Categoria
  public usuario: Usuario
}
