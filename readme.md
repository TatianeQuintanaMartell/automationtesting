# Desafio de Automação de Testes Web e Api, site : automationtesting.in, serviço : viacep.com.br #

**Este projeto destina-se a construção de testes automatizados para Web e para API.**

  **Para Web** foi utilizado o site que está nesse link :[Clique aqui para acessar o link](http://demo.automationtesting.in/Register.html) 
e foi baseado no seguinte cenário de teste :

* Cenário: Validar a realização de registro de cadastro.

   Caso de Teste1:

   Dado que eu tenho um cadastro para preencher

   Quando eu preencho todas as informações da tela e clico no botão **submit**

   Então as informaçõe são gravadas.



   Caso de Teste2:

   Dado que eu tenho um cadatro para preencher

   Quando eu mão preencho todas as informações obrigatórias da tela e clico no botão **submit**

   Então é mostrada uma msg **"Preencha esse campo"**         



  
   **Para API** foi utilizado o serviço que está nesse link :[Clique aqui para acessar o link](https://viacep.com.br) 
e foi baseado no seguinte cenário de teste :

* Cenário: Consulta Cep válido

Caso de Teste:

Dado que o usuário insere um cep válido

Quando o serviço é consultado

Então é retornado cep, logradouro, complemento, bairro, localidade, uf, ibge, gia, ddd, siafi



* Cenário: Consulta Cep inexistente

Caso de Teste: Dado que o usuário insere um cep que não existe na base dos correios

Quando o serviço é consultado

Então é retornado um atributo de erro   


* Cenário: Consulta Cep com formato inválido

Caso de Teste3 : Dado que o usuário insere um cep com formato inválido

Quando o serviço é consultado

Então é retornada uma mensagem de erro                                       

   

      As tecnologias utilizadas foram :
      * Linguagem de programação Java (versão 1.8.0_121)
      * Maven framework (versão 8)
      * Selenium (versão 3.141.59)
      * junit (versão 5.6.8)
      *Allure (versão 2.13.5)
      

Para geração dos relatórios será necessário instalar o interpretador de linha de comando Allure [Clique aqui para acessar o link](https://www.swtestacademy.com/allure-report-junit5/)

e após deve ser digitada a seguinte instrução na linha de comando: **allure serve target/allure-results**

~
~
~
~

