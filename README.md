<h2 align="center">
Olá! Esse é o projeto do grupo 3, o ApoiaTurismo!
</h2>

<div>
<h4 align="center">

![Logo_apoia_turismo](https://user-images.githubusercontent.com/19335381/139083129-234c4cca-1af1-4b8f-929d-a89666c0065c.png)

</h4>
<h3>
  No momento estamos no estágio de desenvolver o banco de dados
</h3>
<h4 align="center">

![chrome_esbFLAM3aX](https://user-images.githubusercontent.com/19335381/139084525-baa7c1a3-8766-424f-8102-c1659d1af0ba.png)

</h4>

Tabela Usuário: <br>
<br>
>  id_usuario - É o atributo único de cada usuário no site; <br>
>  nome - um nome para representar a pessoa, não necessariamente um nome completo, podendo ser um apelido, por exemplo; <br>
>  email - email com um endereço único para identificar e ter contato com o usuário; <br>
>  senha - senha para o acesso do usuário à plataforma. <br>
<br>
Tabela Categoria: <br>
<br>
>  id_categoria - É o atributo único de cada Categoria no site; <br>
>  tipo - Identificação se é um produto ou serviço; <br>
>  descrição - Representação da exposição dos detalhes de cada produto; <br>
>  região - Identificar a criação oriundo de cada produto. <br>
<br>
Tabela Produto: <br>
<br>
>  id_produto - É o atributo único de cada produto no site; <br>
>  titulo - Introdução do produto; <br>
>  foto - A representação fotográfica do produto; <br>
>  descricao - Descrição do produto e suas características; <br>
>  preco - O valor monetário em moeda local do produto; <br>
>  fk_categoria - Atributo conectivo entre as tabelas; <br>
>  fk_ usuário - Atributo conectivo entre as tabelas; <br>
