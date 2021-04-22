select column_name, data_type 
from information_schema.columns 
where table_name = 'banco';

-- Avg
-- Count (having)
-- Max
-- Min
-- Sum

select avg(valor) from cliente_transacoes;

select count(numero) from cliente;

select count(numero), email 
from cliente where email ilike '%@gmail.com' group by email;

select max(numero) from cliente;

select min(numero) from cliente;

select max(valor) from cliente_transacoes;

select min(valor) from cliente_transacoes;

select max(valor), tipo_transacao_id
from cliente_transacoes
group by tipo_transacao_id;

select min(valor), tipo_transacao_id
from cliente_transacoes
group by tipo_transacao_id;

select count(id), tipo_transacao_id 
from cliente_transacoes 
group by tipo_transacao_id
having count(id) > 150;

select sum(valor) from cliente_transacoes;

select sum(valor), tipo_transacao_id
from cliente_transacoes
group by tipo_transacao_id
order by sum(valor) desc;