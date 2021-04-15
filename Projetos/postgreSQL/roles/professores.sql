create role professores nocreatedb nocreaterole inherit nologin nobypassrls connection limit 10;
alter role professores password 'senha123';

create role daniel login password 'senha123';
drop role daniel;
create role daniel login password 'senha123' in role professores;

create table teste (nome varchar);
grant all on table teste to professores;

revoke professores from daniel;
