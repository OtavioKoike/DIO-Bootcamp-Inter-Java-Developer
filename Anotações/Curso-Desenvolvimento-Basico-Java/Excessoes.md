# Trabalhando com Excessoes

Excessoes sao todos erros que ocorrem durante o processamento de um metodo que podem ser esperados ou não esperados. Como o termo já diz, "Exceptions" são excessoes. Falhas que nao devem ocorrer rotineiramente no fluxo de um sistema.

## Tipos de Excessoes

### Checked Exceptions
São excessoes esperadas, cujo fluxo ou metodo de um sistema foi preparado para recever. Um bom exemplo é uma excessao de negocio, onde se deseja informar um erro caso a excessao esperada ocorra.
	
### Unchecked Exceptions
São excessoes não esperadas para o fluco ou metodo de um sistema, um bom exemplo é a famosa NullPointException que ocorre quando se tenta acessar uma instancia que nao existe, dentre outros motivos.
	
### Bloco Try Catch
O bloco try catch sempre é utilizado quando no processo que será executado sentro de um metodo é esperado um erro, então cria-se um bloco "protegido" onde qualquer erro que ocorra dentro do trecho "try" é direcionado para o trecho "catch" e sofrera o devido tratamento de erro.

### Finally
O finally é um bloco de codigo que pode ou não ser utilizado junto ao try catch, este trecho de codigo sempre sera executado independente se ocorrer erro ou não dentro do fluxo onde existe o try catch. Normalmente o finally é usado para liberar recursos ou para dar continuidade em um fluxo que deve ocorrer independente de erro.

### Throw e Throws
- Throws: É a assinatura do metodo que sera retornado caso ocorra erro para o metodo que fez a chamada, dentro de um fluxo encadeado
- Throw: É usado para lançar a excecao desejada, juntamente com a mensagem de erro, para o metodo que fez a chamada	
