import { Produto } from "./Produto"

export class Usuario{
  public idUsuario: number
  public nomeUsuario: string
  public nick: string
  public email: string
  public senha: string
  public foto: string
  public produto: Produto[]
}
