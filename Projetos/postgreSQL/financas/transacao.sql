select numero, nome, ativo from banco order by numero;

update banco set ativo = false where numero = 0;

begin;
	update banco set ativo = true where numero = 0;
	select numero, nome, ativo from banco where numero = 0;
rollback;

select numero, nome, ativo from banco where numero = 0;

begin;
	update banco set ativo = true where numero = 0;
commit;

select numero, nome, ativo from banco where numero = 0;

select id, gerente, nome from funcionarios;

begin;
	update funcionarios set gerente = 2 where id = 3;
	savepoint sp_func;
	update funcionarios set gerente = null;
	rollback to sp_func;
	update funcionarios set gerente = 3 where id = 5;
commit;

select id, gerente, nome from funcionarios;

