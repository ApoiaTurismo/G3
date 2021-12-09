import { Produto } from "./Produto"

export class Categoria{
  public idCategoria: number
  public tipo: string
  public descricaoCategoria: string
  public icone: string
  public produto: Produto[]
}
