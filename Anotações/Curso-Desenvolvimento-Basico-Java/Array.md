# Trabalhando com Arrays

> Array ou Matriz é uma estrutura de dados que nos permite organizar valores na memoria.

- Cada item em um array é chamado de elemento
- Cada elemento é acessado pela posicao numerica (indice)
- O indice inicia a partir do 0
- Ao se declarar um array, todos indices sao inicializados em 0.
- Array não podem mudar de tamanho.

---
## Declaração

```
dataType[] arrayName = new dataType[arraySize];
```
ou
```
dataType[] arrayName = {value0, value1, ..., valueN};
```

### Para arrays multidimensionais:
```
dataType[][] arrayName = {{value0N, ..., valueMN}, {value0M, ..., value NM}}
```
---
## Tamanho do Array

```
arrayName.length
```	