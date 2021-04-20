# Instalação MySQL

Atualizar repositório
```
sudo apt update
```

Instalar MySQL
```
sudo apt install mysql-server
```

Verificar se instalação foi um sucesso (deve aparecer a versão do MySQL instalado).
```
mysql --version
```

(OPCIONAL) Trocar valores defaults para aumentar segurança
```
sudo mysql_secure_installation
```

---
## Configurar Usuario e Senha

Acessar banco de dados MySQL
```
sudo mysql
```

Adicionar senha "password" ao usuário "root" (Rodar no prompt do  MySQL)
```
ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'password';
```

Recarregar permissões de acesso ao banco de dados (Rodar no prompt do  MySQL)
```
FLUSH PRIVILEGES;
```

Sair do prompt do MySQL
```
quit;
```

> A partir de agora, para acessar o mysql deverá ser utilizado o comando abaixo.
> Quando pedir a senha, deverá colocar a senha: password
```
mysql -u root -p
```

---
## Instalar MySQL Workbench

Atualizar repositório
```
sudo apt update
```

Instalar MySQL Workbench
```
sudo apt install mysql-workbench
```

Executar MySQL Workbench (também pode executar ao pesquisar por "workbench" em uma GUI do linux)
```
mysql-workbench
```

---
## Criar Banco de Dados

 Acessar banco de dados. Pode ser workbench ou linha de comando (conforme o comando abaixo)
```
mysql -u root -p
```

> Enter password: password

Criar um banco de dados (rodar no prompt do MySQL OU no MySQL workbench)
```sql
CREATE database digital_innovation_one;
```

Usar o banco recém criado (digital_innovation_one) (rodar no prompt do MySQL OU no MySQL workbench)
```sql
USE digital_innovation_one;
```

---
## Criar uma Tabela

Acessar banco de dados. Pode ser workbench ou linha de comando (conforme o comando abaixo)
```
mysql -u root -p
```
> Enter password: password

(CASO NÂO ESTEJA NO BANCO DE DADOS) Mudar para o banco digital_innovation_one (rodar no prompt do MySQL OU no MySQL workbench)
```sql
USE digital_innovation_one;
```

Criar uma tabela no banco de dados (rodar no prompt do MySQL OU no MySQL workbench)
```sql
CREATE TABLE aluno (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(80) NOT NULL,
    idade INTEGER NOT NULL,
    estado CHARACTER(2) NOT NULL
);
```

Adicionar alguns exemplos (rodar no prompt do MySQL OU no MySQL workbench)
```sql
INSERT INTO aluno(nome, idade, estado) VALUES ('Pedro', 20, 'RJ');
INSERT INTO aluno(nome, idade, estado) VALUES ('Maria', 35, 'AC');
INSERT INTO aluno(nome, idade, estado) VALUES ('Joao', 10, 'SC');
INSERT INTO aluno(nome, idade, estado) VALUES ('Ana', 51, 'GO');
```

---
> O PASSO ABAIXO É NECESSÁRIO PARA EXECUTAR AS PRÓXIMAS TAREFAS DA PART2 e PART3

> O PASSO ABAIXO FOI UTILIZADO EM UM PROJETO GRADLE
> CASO ESTEJA USANDO MAVEN (ou nenhum gerenciador de pacotes) DEVERÁ SER UTILIZADO OUTRO GUIA

---
## Baixar Driver Para o Java se Comunicar com o DB

No gradle deve-se adicionar no "build.gradle" (na parte de "dependencies") a linha abaixo
```
compile group: 'mysql', name: 'mysql-connector-java', version: '8.0.17'
```