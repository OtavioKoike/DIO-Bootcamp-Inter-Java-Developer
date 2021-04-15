# Lambdas Expressions

Os lambdas obdecem o conceito do paradigma funcional, com eles podemos facilitar legibilidade do nosso codigo, alem disso com a nova API Funcional do java podemos ter uma alta produtividade para lidar com objetos. 

Primeiramente, devemos entender o que sao interfaces funcionais. Interfaces funcionais, são interfaces que possuem apenas um metodo abstrato. Geralmente as interfaces funcionais possuem uma anotação em nivel de classe

```
@FunctionalInterface
```

para forcar o compilador a apontar um erro que se a interface não estiver do acordo com as regras de uma interface funcional. Esta anotação não obrigatoria, pois o compilador consegue reconhecer uma interface em tempo de compilacao

---
## Estrutura da Lambda:

```
InterfaceFuncional nomeVariavel = parametro -> logica
```

---
## Regras para implementacao

Quando uma lambda possui apenas uma instrucao no corpo de sua logica não é necessario o uso de chaves
Se a funcao possui mais de uma instrucao DEVEMOS utilizar chaves e alem disse deve explicitar o retorno se o retorno for diferente de void

> codigo no projeto Desenvolvimento Avancado