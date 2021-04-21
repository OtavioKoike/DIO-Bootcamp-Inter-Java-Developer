# SOAP

> Simple Object Access Protocol

É um protocolo baseado em XML para acessar serviços web principalmente por HTTP. Pode-se dizer que SOAP é uma definição de como serviços web se comunicam. Foi desenvolvido para facilitar integrações entre aplicações.

---
## Vantagens

- Permite integrações entre aplicações, independente de linguagem, pois usa como linguagem comum o XML.
- É independente de plataforma e software.
- Meio de transporte generico, ou seja, pode ser usado por outros protocolos alem do HTTP.

---
## Estrutura

O "SOAP Message" possui uma estrategia unica que deve sempre ser seguida:

**SOAP Envelope** é o primeiro elemento do documento e é usado para encapsular toda a mensagem SOAP.

**SOAP Header** é o elemento onde possui informação de atributos e metadados da requisição.

**SOAP Body** é o elemento que contem os detalhes da mensagem.

---
## XML 

> Extensible Markup Language

É um alinguagem de marcação criada na decada de 90 pela W3C. Facilita a separação de conteudo. Não tem limitação de criação de tags. Linguagem comum para integrações entre aplicações.

---
## WSDL

> Web Services Description Language

Usado para descrever Web Services, funciona como um contrato do serviço. A descrição é feito em um documento XML, onde é descrito o serviço, a especificação de acesso, operações e metodos.

---
## XSD

> XML Schema Definition

É um schema no formato XML usado para definir a estrutura de dados que será validada no XML. O XSD funciona como uma documentação de como deve ser montado o SOAP Message (XML) que será enviado atraves de Web Service.

--- 
# Exemplo

+ http://soapclient.com/xml/soapresponder.wsdl