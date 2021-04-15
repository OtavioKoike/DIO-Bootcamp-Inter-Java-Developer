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