# Instalação Ubuntu

## Instalação PostgreSQL

https://www.postgresql.org/download/

Como root

```
sudo su
```

Criar arquivo de configuração:

```
sudo sh -c 'echo "deb http://apt.postgresql.org/pub/repos/apt $(lsb_release -cs)-pgdg main" > /etc/apt/sources.list.d/pgdg.list'
``` 

Importar a chave do repositorio oficial:

```
wget --quiet -O - https://www.postgresql.org/media/keys/ACCC4CF8.asc | sudo apt-key add -
```

Atualizar os repositorios:
```
sudo apt-get update
```

Instalar a ultima versão do PostgreSQL:
```
sudo apt-get -y install postgresql
```

---
### Cluster

Criar 

```
pg_createcluster -d /home/postgres/<nome> <versao> <nomeCluster> --start
```

Listar

```
pg_lsclusters
```

---
Mudar para usuario Postgres

> Inicialmente é preciso estar no root

Usuario padrao

```
su - postgres
```

```
sudo -u postgres psql postgres
```

Conectar ao banco de dados:

```
psql
```

Ver se o banco de dados está acessivel:

```
select 1;
```

Trocar a senha do usuario postgres:

```
ALTER USER postgres PASSWORD '<senha>';
```

## Instalação PgAdmin

https://www.pgadmin.org/download

Intale a chave publica para o repositorio:

```
sudo curl https://www.pgadmin.org/static/packages_pgadmin_org.pub | sudo apt-key add
```

Criar arquivo de configuração:

```
sudo sh -c 'echo "deb https://ftp.postgresql.org/pub/pgadmin/pgadmin4/apt/$(lsb_release -cs) pgadmin4 main" > /etc/apt/sources.list.d/pgadmin4.list && apt update'
```

Instalar PgAdmin:

```
sudo apt install pgadmin4
```