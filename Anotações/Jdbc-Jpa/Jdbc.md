# JDBC

JDBC(Java Database Connectivity) é uma API com diversas classes e interfaces escritas na linguagem Java que estão presentes nos pacotes java.sql e javax.sql. Elas permitem que programas em Java realizem conexões em bancos de dados para realizar consultas. Uma dessas classes principais é o driver JDBC que intermedia essa interação. 

Sem a API JDBC, seria necessário conhecer o protocolo proprietário de cada banco de dados para se conectar e realizar consultas. Já com a API JDBC, é utilizada somente UMA interface Java para qualquer banco de dados, deixando o driver  implementar as especificações de cada banco de dados, enquanto o desenvolvedor se preocupa apenas em selecionar um driver e criar as queries (neste caso, consultas SQL).

## Classes Utilizadas

**Classe DriverManager** – Responsável pela comunicação com os drivers disponíveis. É utilizada para criar uma Connection com o banco de dados através de uma URL (que especifica driver, localização do BD e nome do BD).

**Interface Connection** – Representa a conexão com o banco de dados. Permite criar “Statements” que constroem consultas SQL.

## Download Drivers

https://mvnrepository.com/artifact/mysql/mysql-connector-java

Colococar nas dependencias do build.gradle:

```
implementation group: 'mysql', name: 'mysql-connector-java', version: '8.0.23'
```

> (Comandos no projeto **jdbc-jpa**)