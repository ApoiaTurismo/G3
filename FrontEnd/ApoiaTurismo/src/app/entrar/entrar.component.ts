import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { environment } from 'src/environments/environment.prod';
import { UsuarioLogin } from '../model/UsuarioLogin';
import { AlertasService } from '../service/alertas.service';
import { AuthService } from '../service/auth.service';

@Component({
  selector: 'app-entrar',
  templateUrl: './entrar.component.html',
  styleUrls: ['./entrar.component.css']
})
export class EntrarComponent implements OnInit {

  usuarioLogin: UsuarioLogin = new UsuarioLogin

  constructor(
    private auth: AuthService,
    private router: Router,
    private alertas: AlertasService
  ) { }

  ngOnInit() {
    window.scrollTo(0,0)
  }

  entrar(){
    this.auth.entrar(this.usuarioLogin).subscribe((resp: UsuarioLogin) => {
      this.usuarioLogin = resp

      environment.token = this.usuarioLogin.token
      environment.nome = this.usuarioLogin.nomeUsuario
      environment.nick = this.usuarioLogin.nick
      environment.foto = this.usuarioLogin.foto
      environment.id = this.usuarioLogin.id

      console.log(environment)

      this.router.navigate(['/inicio'])
    }, error => {
      if(error.status == 500) this.alertas.showAlertDanger('Usuário ou senha estão incorretos!')

      if(error.status == 401) this.alertas.showAlertDanger('Usuário ou senha estão incorretos!')
    })
    
  }

}
