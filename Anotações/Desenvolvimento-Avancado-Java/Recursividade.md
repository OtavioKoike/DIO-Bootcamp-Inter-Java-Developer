# Recursividade

Na recursividade, uma funcao chama a si mesma repetidamente, até atingir uma condicao de parada. No caso de Java, um metodo chama a si mesmo, passando para si objetos primitivos. Cada chamada gera uma nova entrada na pilha de execucao, e alguns dados podem ser sisponibilizados em um escopo global ou local, atraves de parametros em um escopo global ou local

## Tail Call (Recursividade em cauda)

Recursao em cauda é uma recursao onde não há nenhuma linha de codigo apos a chamada do proprio metodo e, sendo assim, não há nenhum tipo de processamento a ser feito após a chamada recursiva
Obs: a JVM não suporta a recursao em cauda, ele lança um estouro de pilha (StackOverFlow)

---
## Memoization
É uma tecnica de otimizacao que consiste no cache do resultado de uma funcao, baseado nos parametros de entrada. Co isso, nas seguintes execucoes conseguimos ter uma resposta mais rapida

> codigo no projeto Desenvolvimento Avancado
