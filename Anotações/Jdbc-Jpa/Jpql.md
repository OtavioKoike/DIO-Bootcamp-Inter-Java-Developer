# JPQL

O JPQL (Java Persistence Query Language) é uma linguagem de consulta independente orientada a objetos definida pelo JPA.

JPQL é usado para realizar consultas no banco de dados. É inspirado no SQL (inclusive a sua sintaxe), porém ele interage com o banco de dados através das entidades do JPA, ao invés de interagir diretamente nas tabelas de banco de dados (como é no SQL).

Com o JPQL é possíveis utilizar as propriedades de orientação a objetos nas consultas realizadas no banco de dados, através das entidades mapeadas, tal como herança.

---
## Vantagens

### Em relação ao EntityManager

- Operações de busca, atualização e remoção de entidades em MASSA, ao invés de realizar operações em apenas uma instância por vez através de chaves primárias (como nos métodos do entityManager);
- Realizar consultas mais complexas;
- Realizar funções de agregação.

### Em relação ao SQL

- NÃO é necessário realizar os joins explicitamente entre entidades que estão com annotations de relacionamento, pois os joins são criados automaticamente durante uma consulta;
- JPQL utiliza as funcionalidades de carregamento “lazy / eager” nos relacionamento entre entidades, aumentando a eficiência das consultas na aplicação.
- As consultas podem ser armazenadas em cache para melhor performance da aplicação;

---
## Ferramentas

Existe uma alternativa a consultas JPQL a partir do JPA 2.0 chamada JPA Criteria API, que é muito útil para construir consultas dinâmicas.

No JPQL as consultas só são verificadas no momento da execução, não sendo possível detectar erros de sintaxe na consulta durante a compilação. Já o JPA Criteria API consegue detectar esses erros no momento de compilação. 

Essa funcionalidade se torna possível por que no JPA Criteria API as consultas são definidas como instâncias de objetos Java que representam elementos de consulta. Já as consultas JPQL são definidas apenas como "string".

No entanto, o JPA Criteria API é mais complicado de se utilizar do que o JPQL. Sendo assim, para consultas estáticas simples, é preferível utilizar o JPQL, enquanto que para consultas dinâmicas é preferível o JPA Criteria API.

Em relação a eficiência, tanto consultas JPQL quanto consultas JPA Criteria são EQUIVALENTES em poder e eficiência. Portanto, saber quando escolher um ou outro é um grande desafio para projetos de software.

Para o JPA Criteria API verificar os possíveis erros em tempo de compilação, é necessário utilizar o JPA Metamodel para referenciar os atributos das entidades.

O JPA Metamodel provê a habilidade de examinar o modelo de persistência de um objeto para consultar os detalhes de uma entidade JPA. Para cada entidade, uma classes metamodelo é criada com o mesmo nome da classe, porém procedido pelo símbolo _ (underscore) e com os atributos estáticos que representam os campos de persistência.

Sem o JPA Metamodel, os atributos serão referenciados através de Strings, tendo como principal desvantagem o risco de ocorrer algum error em tempo de execução para o usuário final.

> Comandos no projeto [jdbc-jpa](https://github.com/OtavioKoike/DIO-Bootcamp-Inter-Java-Developer/tree/master/Projetos/jdbc-jpa)