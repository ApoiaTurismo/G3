<h1 align="center">
Olá! Esse é o projeto do grupo 3, o ApoiaTurismo!
</h1>

<div>
<h4 align="center">

![Logo_apoia_turismo](https://user-images.githubusercontent.com/19335381/139083129-234c4cca-1af1-4b8f-929d-a89666c0065c.png)

</h4>
<h2>
  A aplicação já esta rodando no Heroku com o backend feito https://apoiaturismo.herokuapp.com/ 
</h2> 
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

