import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { environment } from 'src/environments/environment.prod';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  nick = environment.nick
  foto = environment.foto
  id = environment.id

  constructor(
    private router: Router
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

}
