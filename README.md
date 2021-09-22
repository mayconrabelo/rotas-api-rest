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

#### Postman.

  - Para criar uma rota, deve-se enviar uma requisição POST para /Route contendo uma rota válida.
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
      
  - Lembre-se de usar os termos HTTP para outras operações do CRUD.
  - Com as informações acima, já e possível consumir a API com facilidade.
