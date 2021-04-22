# Importancia dos Profiles

## Multiplos Ambientes

- Ambientes para desenvolvimento, teste e produção
- Banco de dados para cada ambiente
- Execução de testes completas em ambiente de teste
- Simulaçao do ambiente real em staging
- Deplou simplificado em produção

## Spring Boot Profiles

- Configurações próprias para cada ambiente
    - apllication.properties
    - apllication-dev.properties
    - apllication-release.properties

## Configuração

Definir qual profile sera usado

```
spring.profiles.active = dev    //dev ou prod ... 
``` 

No aplication (Exemplo Dev)

```
app:
  message: This is the property file fo the ${spring.application.name} specific to DEV Environment

spring:
  datasource:
    driver-class-name: org.h2.Driver
    url: jdbc:h2:mem:db;DB_CLOSE_DELAY=-1
    username: sa
    password: sa
```

> codigo no projeto [spring-boot](https://github.com/OtavioKoike/DIO-Bootcamp-Inter-Java-Developer/tree/master/Projetos/springboot)