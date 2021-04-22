create or replace function func_somar(integer, integer)
returns integer
security definer
-- returns null on null input
language sql
as $$
	select coalesce ($1, 0) + coalesce ($2, 0);
$$;

select func_somar(1, null);
-- select coalesce (null, 'daniel', 'digital');

-------------------------------------------------------------------------
create or replace function bancos_add(p_numero integer, p_nome varchar, p_ativo boolean)
returns integer
security invoker
language plpgsql
called on null input
as $$
declare variavel_id integer;
begin
	if p_numero is null or p_nome is null or p_ativo is null then
		return 0;
	end if;

	select into variavel_id numero
	from banco
	where numero = p_numero;
	
	if variavel_id is null then 
		insert into banco(numero, nome, ativo)
		values (p_numero, p_nome, p_ativo);
	else
		return variavel_id;
	end if;
	
	select into variavel_id numero
	from banco
	where numero = p_numero;
	
	return variavel_id;
end
$$;

select bancos_add(5433, 'Banco Novo Novo', false);

