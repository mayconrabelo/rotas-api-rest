## Projeto API REST rotas usando Spring.
Disponibiliza uma API com as operações básicas do CRUD (Create, Recover, Update and Delete) de Rotas<br> 
já vem com banco de dados em memória (H2) e com alguns dados previamente adicionados.<br>


<h4 align="center"> 
	🚧 🚀 Em construção...  🚧
</h4>


## Pré-requisitos.

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:

+ Git<br>
+ Eclipse IDE<br>
+ Postman<br>


## Instalação.

#### Faça um git clone no projeto na sua pasta de escolha:

    git clone https://github.com/mayconrabelo/rotas-api-rest.git

## Importando Projeto.
    
Abra o Eclipse IDE, abra a aba file opção import, procure a pasta Maven e nela procure a opção Existing Maven Projects,
selecione o diretório no qual você fez o clone do projeto e click em finish, projeto importado 😎<br>

#### Startando a aplicação.

Abra o package br.com.descartes.rota, click com o botão direito na classe RotasApplication.java, selecione a opção Run As / Java Application.

#### Postman.

  - Para criar uma rota, deve-se enviar uma requisição POST para localhost:8080/Route contendo uma rota válida.
  - Exemplo de rota válida:
  
      {
        "id": 2,
        "data": "2021-09-20T20:00:00",
        "status": "STARTED",
        "paradas": [
            {
                "id": 2,
                "descricao": "ezfomeadoz",
                "endereço": "Av. Bulevar Ⅲ, 329 - Jangurussu, Fortaleza - CE, 60866-305",
                "latitude": -3.8351241302460903,
                "longitude": -38.51795765097331,
                "statusParada": "NOT_ANSWER",
                "deliveryRadius": 10
            }
        ]
      }
      
      
  - Para gerar uma lista de todas as rotas, deve-se enviar uma requisição GET para localhost:8080/Route.
  - Para buscar por uma rota especifica deve-se enviar uma requisição GET para localhost:8080/Route/ ID passando o ID desejado.
  - Para deletar uma rota deve-se enviar uma requisição DELETE para localhost:8080/Route/ID passando o ID da rota a ser excluída.
  - Para editar uma rota deve-se enviar uma requisição PUT para localhost:8080/Route/ID passando o ID da rota que deseja alterar, no corpo da requisição enviar um JSON contendo as alterações como abaixo:
	{
	    "status": "DONE",
	    "paradas": [
		{
		    "descricao": "ezfomeadoz teste atualizacao",
		    "endereço": "Av. Bulevar sao cristovao",
		    "latitude": -3.8351241302460903,
		    "longitude": -38.51795765097331,
		    "statusParada": "NOT_ANSWER",
		    "deliveryRadius": 10
		}
	    ]
	}

  
  - Existe também a opção de consumir a API via Heroku, com o link: https://apirest-rotas.herokuapp.com/Route 
  - Lembre-se de usar os termos HTTP para outras operações do CRUD. 
  - Com as informações acima, já e possível consumir a API com facilidade.
