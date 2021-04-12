package one.innovation.digital.jpa.parte1;

import one.innovation.digital.jpa.classes.Aluno;
import one.innovation.digital.jpa.classes.Estado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//        1 - NÃO ESQUECER DE BAIXAR O DRIVER PARA O BANCO DE DADOS QUE IRÁ UTILIZAR! (Como demonstrado na parte 1 do curso ou na linha abaixo)
//        - No gradle deve-se adicionar no "build.gradle" (na parte de "dependencies") a linha abaixo
//        Defasadooo
//          compile group: 'javax.persistence', name: 'javax.persistence-api', version: '2.2'
//        https://mvnrepository.com/artifact/javax.persistence/javax.persistence-api
//        ver linha de comando atual


public class ExecutionPart1 {
    public static void main(String[] args) {

        // OBS: Esse codigo pode ou nao funcionar de acordo com a biblioteca que foi baixada. Se estiver somente com o JPA baixado, o codigo NAO IRA funcionar.
        // porem se estiver com a biblioteca de algum framework com implementacao JPA (Hibernate ou EclipseLink), o JPA irá automaticamente utiliza-lo.

        // O ideal eh que nessa parte (Parte 1) o codigo EXECUTE COM ERROR (Ao tentar executar irá mostrar um error afirmando que não foi encontradado nenhuma implementação do JPA).
        // pois aqui nao deveria ter nenhuma implementacao JPA sendo utilizada, apenas o JPA puro para demonstrar que através dele é possivel definir a estrutura do codigo e depois escolher
        // a implementacao que ira utilizar. Apenas na parte 2 do curso sera escolhida uma implementacao para o codigo executar sem error

        // 1 - Passos iniciais para criar um gerenciador de entidades com o banco de dados especificado no arquivo "persistence.xml"
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("part1-DIO");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // 2.1 - Criar instancias para serem adicionadas no banco de dados
        Estado estadoParaAdicionar = new Estado("Rio de Janeiro", "RJ");
        Aluno alunoParaAdicionar = new Aluno("Otavio", 22, estadoParaAdicionar);

        // 2.2 - Iniciar uma trasacao para adiconar as instancias no banco de dados
        entityManager.getTransaction().begin();

        entityManager.persist(estadoParaAdicionar);
        entityManager.persist(alunoParaAdicionar);

        entityManager.getTransaction().commit();

        // 3 - Encerrar o gerenciador de entidades e encerrar a fabrica de gerenciadores de entidade.
        entityManager.close();
        entityManagerFactory.close();

    }
}
