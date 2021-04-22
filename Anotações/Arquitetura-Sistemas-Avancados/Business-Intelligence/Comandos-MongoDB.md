# Comandos

> Linhas de comando

Entrar no interpretador
```
mongo
```

> A partir daqui todos comando são dentro do interpretador

Ver Tabelas 
```
show databases
```

Criar e usar banco de dados
```
use loja
```

Inserir item (tabela nao precisa estar criada
```
db.produtos.insert({codigo: "01", descricao: "caneta"})
```

Exibir itens da tabela
```
db.produtos.find()
```