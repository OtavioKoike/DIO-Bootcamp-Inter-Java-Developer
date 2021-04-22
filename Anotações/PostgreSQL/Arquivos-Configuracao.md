# Arquivos de Configurações

## O arquivo Postgresql.conf

Arquivo onde estão definidas e armazenadas todas as configurações do servidor PostgreSQL. Algunsparametros só podem ser alterados com uma reiniciação do banco de dados. A view pg_settings, acessada por dentro do banco de dados, guarda todas as configurações atuais.

### Localização

Por padrao, encontra-se dentro do diretorio PGDATA definido no momento da inicialização do cluster de banco de dados. No sistema operacional Ubuntu, se o PostgreSQL foi instalado a partir do repositorio oficial, o local do arquivo postgresql.conf será diferente do diretorio de dados.

```
/etc/postgresql/[versao]/[nome do cluster]/postgresql.conf
```

### Comandos

Visualizar todas configurações:

```
SELECT name, setting
FROM pg_settings
```

---
## O arquivo pg_hba.conf

Arquivo responsavel pelo controle de autenticação dos usuarios no servidor PostgreSQL

---
## O arquvo pg_ident.conf

Arquivo responsavel por mapear os usuarios do sistema operacional com os usuarios do banco de dados. Localizado no diretorio de dados PGDATA de sua instalação. A opção ident deve ser utilizada no arquivo pg_hba.conf.
