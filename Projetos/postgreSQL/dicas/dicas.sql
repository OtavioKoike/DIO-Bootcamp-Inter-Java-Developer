create table if not exists teste(
	cpf varchar(11) not null primary key,
	nome varchar(50) not null,
	created_at timestamp not null default current_timestamp
);

insert into teste(cpf, nome, created_at) 
values ('11111111111', 'Otavio Koike', '2019-07-01 12:00:00') 
on conflict (cpf) do nothing;

update teste set nome = 'Pedro alvares' where cpf = '11111111111';

select * from teste;