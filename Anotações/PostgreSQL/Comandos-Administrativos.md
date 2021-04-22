# Comandos Administrativos

Listagem de todos os clusters
```
pg_lsclusters
```

Criar novo cluster
```
pg_createcluster <version> <cluster name>
```

Apagar um cluster
```
pg_dropcluster <version> <cluster>
```

Start, Stop, Status, Restart de cluster
```
pg_ctlcluster <version> <cluster> <action>
```

> Os comandos citados no curso estão em formato .sql no projeto [postgreSQL](https://github.com/OtavioKoike/DIO-Bootcamp-Inter-Java-Developer/tree/master/Projetos/postgreSQL)

---
## Binarios do PostgreSQL
- createbd
- createuser
- dropdb
- dropuser
- initdb
- pg_ctl
- pg_basebackup
- pg_dump / pg_dumpall
- pg_restore
- psql
- reindexdb
- vacuumdb