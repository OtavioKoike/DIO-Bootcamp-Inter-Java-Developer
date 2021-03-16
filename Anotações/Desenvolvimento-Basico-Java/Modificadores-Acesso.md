# Caracteristicas da Linguagem Java

## Modificadores de Acesso

### Public
Public pode ser acessada de qualquer lugar por qualquer entidade que possa visualizar a classe a que ela pertence.
	
### Private
Os metodos e atributos da classe definidos como privados não podem ser acessados ou usados por nenhuma outra classe. Esses atributos e metodos tambem nao podem ser visualizados pelas classes herdadas.

### Protected
Torna o membro acessivel as classes do mesmo pacote ou atraves de heranca, seus membros herdados nao sao acessiveis a outras classes fora do pacote em que foram declarados.
	
### Default
A classe e/ou seus membros são acessiveis somente por classes do mesmo pacote, na sua declaracao nao é deficnido nenhum tipo de modificador, sendo este identificado pelo compilador.

> (Comandos no projeto **desenvolvimento-basico**)

---
### Abstract
Esse modificados não é aplicado nas variaveis, apenas em classes e metodos. Uma classe abstrata não pode ser instanciada. Se houver alguma declaracao de um metodo como abstract, a classe tambem deve ser marcada como abstract.
	

### Statics
É usado para criacao de uma variavel que podera ser acessada por todas as instancias de objetos desta classe como uma variavel comum, ou seja, a variavel criada sera a mesma em todas as instancias, a modificacao ocorre em todas as demais. E nas declaracoes de metodos ajudam no acesso direto a classe, portanto nao é necessario instanciar um objeto para acessar o metodo.
	
### Final
Quando é aplicado na classe, não permite estender, nos metodos impede que o mesmo seja sobrescrito (overriding) na subclasse, e nos valores de variaveis não pode ser alterado depois que ja tenha sido atribuido um valor.

> (Comandos no projeto **desenvolvimento-basico**)

---
## Outros Tipos de "Classes"

### Interfaces
- Metodos Abstratos
- Metodos Default
- Heranca Multipla
	
### Enums
- Basicamente é dicionario de dados imutavel
- Não é permitido criar novas instancias
- O construtor é sempre declarado como private
- Por convencao, por serem objetos constantes e imutaveis (static final), os nomes sao em MAIUSCULOS

> (Comandos no projeto **desenvolvimento-basico**)