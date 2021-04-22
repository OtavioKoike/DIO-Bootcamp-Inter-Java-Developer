select numero, nome, ativo from banco;

create or replace view vw_bancos as(
	select numero, nome, ativo from banco
);

select numero, nome, ativo from vw_bancos;

create or replace view vw_bancos_2(banco_numero, banco_nome, banco_ativo) as(
	select numero, nome, ativo from banco
);

select banco_numero, banco_nome, banco_ativo from vw_bancos_2;

insert into vw_bancos_2(banco_numero, banco_nome, banco_ativo)
values (51, 'Banco Boa Ideia', true);

select banco_numero, banco_nome, banco_ativo 
	from vw_bancos_2 
	where banco_numero = 51;
	
select numero, nome, ativo
	from banco
	where numero = 51;
	
update vw_bancos_2 set banco_ativo = false where banco_numero = 51;

select banco_numero, banco_nome, banco_ativo 
	from vw_bancos_2 
	where banco_numero = 51;
	
delete from vw_bancos_2 where banco_numero = 51;


create or replace temporary view vw_agencia as (
	select nome from agencia
);

select nome from vw_agencia;
-- nao funciona em outra sessao por ser temporaria

create or replace view vw_bancos_ativos as(
	select numero, nome, ativo
	from banco
	where ativo is true
) with local check option;

-- Erro por causa do check
-- insert into vw_bancos_ativos(numero, nome, ativo) values (51, 'Banco Boa Ideia', false);

create or replace view vw_bancos_com_a as(
	select numero, nome, ativo
	from vw_bancos_ativos
	where nome ilike 'a%'
) with local check option; 

select numero, nome, ativo from vw_bancos_com_a;

-- Erro por causa do check
-- insert into vw_bancos_com_a(numero, nome, ativo) values(333, 'Beta Omega', true);

-- insert into vw_bancos_com_a(numero, nome, ativo) values(333, 'Alpha Omega', true);

-- Erro por causa do check
-- insert into vw_bancos_com_a(numero, nome, ativo) values(331, 'Alpha Omega', false);

create or replace view vw_bancos_ativos as(
	select numero, nome, ativo
	from banco
	where ativo is true
);

create or replace view vw_bancos_com_a as(
	select numero, nome, ativo
	from vw_bancos_ativos
	where nome ilike 'a%'
) with cascaded check option; 

-- Erro por causa do check cascaded
-- insert into vw_bancos_com_a(numero, nome, ativo) values(332, 'Alpha Omega', false);

