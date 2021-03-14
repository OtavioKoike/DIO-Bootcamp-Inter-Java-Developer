# SOLID

> Solid é um acronimo dos principios da programacao orientada a objetos. Auxiliam o programador a escrever codigos mais limpos, facilitando a refatoracao e estimulando o reaproveitamento do codigo.

---
## S
Single Responsibility Principle (Principio da Responsabilidade Unica)
  
## O
Open Closed Principle (Principio Aberto Fechado)
    
## L
Liskov Substituiton Principle (Principio da Substituição de Liskov)
  
## I
Interface Segregation Principle (Principio da segregação da Interface)
    
## D
Dependency Inversion Principle (Principio da Inversão da Dependencia)
  
---
## Explicação

### Single Responsibility Principle (SRP)

> "Uma classe deve ter um, e somente um, motivo para mudar"
A classe deve possuir uma unica responsabilidade dentro do software.
  
### Open Closed Principle (OCP)

> "Voce deve poder estender um comportamento de classe, sem modifica-lo"	
Objetos devem estar abertas para extensao, mas fechados para modificacao. Quando novos comportamentos precisam ser adicionados no software, devemos estender e nao alterar o codigo original.	

### Liskov Substituiton Principle (LSP)

> "Classes derivadas devem ser substituiveis por suas classes base"
Para cada um objeto o1 do tipo S há um objeto o2 do tipo T de forma que, para todos programas P, o comportamento de P é inalterado quando o1 é substituido por o2, então S é um subtipo de T.

### Interface Segregation Principle (ISP)

> "Faca interfaces refinadas que são especificas do cliente."
Uma classe não deve ser forçada a implementar interfaces e metodos que nao serao utilizados. É melhor criar interfaces mais especificas ao inves de termos uma unica interface generica.

### Dependency Inversion Principle (DIP)

> "Dependa de abstrações e nao de implementações"
Um modulo de alto nivel não deve depender de modulos de baixo nivel, ambos devem depender da abstracao. Na pratica, devemos sempre depender de interfaces, não de classes concretas.
