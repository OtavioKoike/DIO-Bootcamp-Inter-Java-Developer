# REST

> Representational State Transfer

É um estilo de arquitetura de software que define a implementação de um serviço web. Podem trabalhar com formatos XML, JSON e outros.

---
## Vantagens

- Permite integrações entre aplicações e também entre cliente e servidor em paginas web e aplicações.
- Utiliza dos metodos HTTP para definir a operação que está sendo efetuada.
- Arquitetura de facil compreensão.

---
## Arquitetura

O cliente faz uma requisição HTTP (GET, POST, PUT, DELETE ...) ao servidor.\
O servidor retorna um codigo de operação, retorna uma mensagem (Texto, JSON, XML ...)
## API

> Application Programming Interface

São conjunto de rotinas documentados e disponibilizados por uma aplicação para que outras aplicações possam consumir suas funcionalidades. Ficou popular com o aumento dos serviços web.

---
## Metodos HTTP

- **Get** - Solicita a representação de um recurso
- **Post** - Solicita a criação de um recurso
- **Delete** - Solicita a exclusão de um recurso
- **Put** - Solicita a atualização de um recurso

---
## JSON

> JavaScript Object Notation

Formatação leve utilizada para troca de mensagens entre sistemas. Usa-se de uma estrutura de chave e valor e tambem listas ordenadas. Um dos formatos mais populares e mais utilizados para troca de mensagens entre sistemas.

---
## Codigo de estado

- **1xx** - Informativo
- **2xx** - Sucesso
- **3xx** - Redirecionamento
- **4xx** - Erro do Cliente
- **5xx** - Erro do Servidor