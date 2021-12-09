function verificaSenha(){
  var senha = document.getElementById('senha').value;
  var confSenha = document.getElementById('confirmSenha').value;

  if(senha != confSenha){
    document.getElementById('senha').style.outlineColor = "#D92027";
  }
}
