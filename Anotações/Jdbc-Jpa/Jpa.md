# JPA

Para padronizar as interfaces das implementações ORM (Mapeamento Objeto Relacional) foi criada uma ESPECIFICAÇÃO oficial chamada JPA (ou Java Persistence API). Ela descreve como deve ser o comportamento dos frameworks Java ORM que desejarem IMPLEMENTAR a sua especificação.

Logo SOMENTE com a ESPECIFICAÇÃO JPA NÃO será possível executar operações entre a aplicação e o banco de dados.

Apesar de ser SOMENTE a especificação, o JPA possui algumas classes, interfaces e anotações que ajudam o desenvolvedor a abstrair o código.

Esses artefatos estão presentes no pacote javax.persistence que ajudam a manter o código independente da implementação utilizada. Lembrando que para persistir dados com JPA, é preciso escolher uma implementação que irá executar todo o trabalho.

---
## Artefatos

Anotação @Entity – Indica a aplicação que os OBJETOS da classe especificada serão persistidos no banco de dados. Também podem ser utilizadas outras anotações para auxiliar no mapeamento da classe, tais como: @id, @column, @table, @OneToMany e @ManyToOne.

Interface EntityManager – É utilizada para gerenciar o ciclo de vida das entidades. Os principais métodos utilizados são find, persist e remove.

---
### Entidades

@Table – É uma annotation opcional. Por padrão o NOME da entidade é usado para realizar o mapeamento com o nome da TABELA do banco de dados. Essa annotation será necessária caso o nome da entidade seja diferente do nome da tabela no banco de dados.

@Column – É uma annotation opcional. Por padrão o ATRIBUTO da entidade é usado para realizar o mapeamento com o nome da COLUNA do banco de dados. Essa annotation será necessária caso os atributos da entidade sejam diferentes das colunas do banco de dados.

@Id – É OBRIGATÓRIO especificar ao menos uma ID para a entidade.

---
### Relacionamento

Também existem as annotations de relacionamento que são utilizadas para representar os relacionamentos entre TABELAS do banco de dados (através das chaves estrangeiras no banco de dados) em uma aplicação que esteja utilizando o JPA. As principais annotations são @ManyToMany, @ManyToOne, @OneToMany e @OneToOne.

Na aplicação utilizando JPA, é possível realizar relacionamento unidirecionais e bidirecionais. No unidirecional é possível chegar de uma instância A para uma instância B facilmente, porém o caminho contrário é dificultado. Na bidirecional, tanto do A para o B, quanto do B para o A o acesso é facilitado.

Nas annotations de relacionamento, a propriedade “fetch” exige atenção especial do desenvolvedor. Seus possíveis valores são eager (ansioso) ou lazy (preguiçoso). Suas características são:

Eager – A entidade mapeada com esse atributo SEMPRE será carregada na aplicação quando a entidade que está MAPEANDO for consultada, mesmo que nunca seja utilizada durante a execução da aplicação.

Lazy – A entidade mapeada com esse atributo SOMENTE será carregada na aplicação quando esta for EXPLICITAMENTE consultada pela entidade que está mapeando (É o mais aconselhável de usar caso não se saiba, em um primeiro momento, o real número de frequência de consultas).

---
## Ferramentas

Lembrando que para utilizar o JPA É NECESSÁRIO utilizar alguma implementação, pois o JPA é apenas a ESPECIFICAÇÃO. Algumas das implementações mais conhecidas para o JPA são:

Hibernate é uma ferramenta ORM open source e é a líder de mercado, sendo a inspiração para a especificação Java Persistence API (JPA). O Hibernate nasceu SEM JPA e tinha sua própria implementação ORM (que ainda é possível usar), porém as versões atuais já possuem compatibilidade com a especificação JPA e são mais aconselháveis de usar do que a implementação nativa.

EclipseLink é um projeto open source de persistência da Eclipse Foundation. Ele é a implementação de referecia do JPA, além de permitir desenvolvedores interagirem com vários serviços de data, incluindo banco de dados, web services, OXM (Object XML mapping), EIS (Enterprise Information Systems). Alguns padrões suportados pelo EclipseLink são: JPA, JAXB, JCA, SOD.

---
## Download Drivers


https://mvnrepository.com/artifact/mysql/mysql-connector-java

Colococar JDBC nas dependencias do build.gradle:

```
implementation group: 'mysql', name: 'mysql-connector-java', version: '8.0.23'
```

https://mvnrepository.com/artifact/javax.persistence/javax.persistence-api

Colococar JPA nas dependencias do build.gradle:

```
implementation group: 'javax.persistence', name: 'javax.persistence-api', version: '2.2'
```

### Ferramentas

> Usar um ou outro

https://mvnrepository.com/artifact/org.hibernate/hibernate-core

Colococar Hibernate nas dependencias do build.gradle:

```
implementation group: 'org.hibernate', name: 'hibernate-core', version: '5.4.30.Final'
```

https://mvnrepository.com/artifact/org.eclipse.persistence/eclipselink

Colococar EclipseLink nas dependencias do build.gradle:

```
implementation group: 'org.eclipse.persistence', name: 'eclipselink', version: '3.0.0'
```

---
## Configuração

Criar o arquivo persistence.xml e configurar os seguintes parâmetros: URL da string de conexão (driver, endereço do BD e nome do BD), usuário do BD, senha do BD, driver e classes que serão mapeadas para serem usadas pelo JPA.

> (Comandos no projeto **jdbc-jpa**)