# Arquitetura de Dados

## SQL

- DDL - Data Definition Language
- DML - Data Manipulation Language
- DQL - Data Query Language

---
## DDL

```sql
create table cliente(
	codigo numeric(10) not null primary key,
	nome varchar(100) not null,
	telefone varchar(15)
);
```

---
## DML

```sql
insert into cliente (codigo, nome, telefone)
values (1, 'Lorem Ipsum', '(88)88888-8888');

Delete from cliente
where codigo = 1;

Update Cliente set nome = "Lorem Ipsum"
Where codigo = 1;
```

---
## DQL

```sql
select codigo. nome
from cliente
where codigo = 1
    group by profissao
    having count(1) > 0
order by nome, codigo
```