# Collections

## List

```
Java.util.List
```

### Implementacoes
- java.util.ArrayList   
- java.util.Vector

### Caracteristicas
- Garante ordem de inserção  
- Permite adicao, atualizacao, leitura e remoção sem regras adicionais
- Permite ordenacao araves de comparators

> (Comandos no projeto **collections-streams**)

--- 
## Queue

```
Java.util.Queue
```

### Implementacoes
- java.util.LinkedList

### Caracteristicas

- Garante ordem de inserção
- Permite adicao, leitura e remoção considerando a regra basica de uma fila: Primeiro que entra, primeiro - que sai.
- Não permite mudanca de ordenação

> (Comandos no projeto **collections-streams**)

---
## Set

> Melhor em performace

```
Java.util.Set
```

### Implementacoes
- java.util.HashSet
- java.util.TreeSet
- java.util.LinkedHashSet

### Caracteristicas

- Por padrao, nao garante ordem
- Nao permite itens repetidos
- Permite adição e remoção normalmente. Não possui busca por item e atualização. Para leitura, apenas navegação.
- Não permite mudanca de ordenacao

> (Comandos no projeto **collections-streams**)

### HashSet
- Quando Utilizar
    - Quando não é necessario manter ordenacao
- Ordenacao
    - Não é ordenado, e nao permite valores repetidos
- Performace
    - Por não ter repeticao de valores e nao ser ordenado, é a implementacao mais performatica

### LinkedHashSet
- Quando Utilizar
    - Quando é necessario manter a ordem de insercao dos elementos
- Ordenacao
    - Mantem a ordem de insercao dos elementos
- Performace
	- é a implementacao mais lenta por ser necessaria manter a ordem
		
### TreeSet
- Quando Utilizar
	- Quando é necessario alterar a ordem atraves do use de comparators
- Ordenacao
	- Mantem a ordem e pode ser reordenado
- Performace
	- E performatica para leitura. Para modificacao tem a necessidade de reordenar, sendo mais lento que o LinkedHashSet

---
## Map

```
java.util.Map
```
> Nao extende de Collections

### Implementações
- java.util.HashMap
- java.util.TreeMap
- java.util.HashTable

### Caracteristicas

- Entrada de chave e valor
- Permite valores repetidos, mas nao permite repetição de chave
- Permite adicao, busca por chave ou valor, atualização, remocao e navegacao
- Pode ser ordenado

> (Comandos no projeto **collections-streams**)