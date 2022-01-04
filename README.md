<h1 align="center">
Olá! Esse é o projeto do grupo 3, o ApoiaTurismo!
</h1>

<div>
<h4 align="center">

![Logo_apoia_turismo](https://user-images.githubusercontent.com/19335381/139083129-234c4cca-1af1-4b8f-929d-a89666c0065c.png)

</h4 >
<h2 align="center">
O apoia turismo é um projeto de e-commerce feito na GenerationBrasil
</h2> 
<h4 align="center">
Ele foi criado com base na ODS 8 - Trabalho decente e Crescimento Econômico.
Especificamente o 8.9 "Até 2030, elaborar e implementar políticas para promover o turismo sustentável, que gera empregos e promove a cultura e os produtos locais."
</h4>
 
 <h4 align="center">
  <img align="center" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/javascript/javascript-original.svg"> + 
  <img align="center" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg"> +
  <img align="center" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg"> +
  <img align="center" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original.svg"> +
  <img align="center" width="60" height="30" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/bootstrap/bootstrap-original.svg"> +
  <img align="center" width="40" height="30" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/angularjs/angularjs-original.svg" />
<h4/>   
  
<h3 align="center">
Ele está já está pronto e rodando nesse link: https://apoiaturismo.netlify.app/
</h3>

![chrome_3l4yyXrafN](https://user-images.githubusercontent.com/19335381/148120600-716cdd07-bc6e-4aca-a96a-029c521ba722.png)

<hr>  
<h3>
Funções implementadas:
 </h3>
<ul>
<li>Cadastro e Login de usuários</li>
<li>Mostrar todos os anúncios com o título, descrição, preço e usuário que publicou</li>
<li>Cadastrar novos produtos e categorias</li>
<li>Barra de categorias rápida, junto com uma barra de pesquisa por título</li>
<li>Poder editar ou excluir os próprios anúncios e o próprio perfil</li>
<li>Uma partezinha sobre nós, da uma olhadinha lá :)</li>
</ul>

![image](https://user-images.githubusercontent.com/19335381/148122398-254785b1-a575-479a-abcd-adb1edf3c333.png)
![image](https://user-images.githubusercontent.com/19335381/148123084-30958654-7d80-403c-9d8e-a82827568deb.png)
   
<hr>   
  
<h2 align="center">   
Quer saber um pouco mais sobre nosso backend?  
</h2>
Toda nossa documentação de backend está feita no swagger: https://apoiaturismo.herokuapp.com/swagger-ui/
<h4 align="center">
  
![chrome_DfuX26tE7F](https://user-images.githubusercontent.com/19335381/142626427-e8f5fbba-f591-471a-937a-406195827495.png)
  
</h4>  
<h4 align="center">

![chrome_Qp6n3VONk3](https://user-images.githubusercontent.com/19335381/140969308-c0889633-7c82-4c28-b90f-fc36359133e9.png)

</h4>
<h4>
Tabela Usuário:
</h4>
<ul>
<li>id_usuario - É o atributo único de cada usuário no site;</li>
<li>nome - um nome para representar a pessoa, não necessariamente um nome completo, podendo ser um apelido, por exemplo; </li>
<li>email - email com um endereço único para identificar e ter contato com o usuário; </li>
<li>senha - senha para o acesso do usuário à plataforma. </li>
</ul>
<h4>
Tabela Categoria:
</h4>
<ul>
<li>id_categoria - É o atributo único de cada Categoria no site;</li>
<li>tipo - Identificação se é um produto ou serviço;</li>
<li>descrição - Representação da exposição dos detalhes de cada produto;</li>
<li>icone - atributo para o ícone/imagem da categoria.</li>
</ul>
<h4>
Tabela Produto:
</h4>
<ul>
<li>id_produto - É o atributo único de cada produto no site;</li>
<li>titulo - Introdução do produto;</li>
<li>foto - A representação fotográfica do produto;</li>
<li>descricao - Descrição do produto e suas características;</li>
<li>preco - O valor monetário em moeda local do produto;</li>
<li>regiao - Identificar a criação oriundo de cada produto.</li>
<li>fk_categoria - Atributo conectivo entre as tabelas;</li>
<li>fk_ usuário - Atributo conectivo entre as tabelas;</li>
</ul>

