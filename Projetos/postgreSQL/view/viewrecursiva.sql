create table if not exists funcionarios(
	id serial primary key,
	nome varchar(50),
	gerente integer,
	foreign key (gerente) references funcionarios(id)
);

insert into funcionarios (nome, gerente) values ('Ancelmo', null);
insert into funcionarios (nome, gerente) values ('Beatriz', 1);
insert into funcionarios (nome, gerente) values ('Magno', 1);
insert into funcionarios (nome, gerente) values ('Cremilda', 2);
insert into funcionarios (nome, gerente) values ('Wagner', 4);

select id, nome, gerente from funcionarios where gerente is null
union all
select id, nome, gerente from funcionarios where id = 999; --Exemplificar


create or replace recursive view vw_func(id, gerente, funcionario) as(
	select id, gerente, nome
	from funcionarios
	where gerente is null
	
	union all
	
	select funcionarios.id, funcionarios.gerente, funcionarios. nome
	from funcionarios
	join vw_func on vw_func.id = funcionarios.gerente
);

select id, gerente, funcionario from vw_func;