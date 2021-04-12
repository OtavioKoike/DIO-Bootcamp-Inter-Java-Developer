package one.innovation.digital.jdbc.parte2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {

//        1 - NÃO ESQUECER DE BAIXAR O DRIVER PARA O BANCO DE DADOS QUE IRÁ UTILIZAR! (Como demonstrado na parte 1 do curso ou na linha abaixo)
//        - No gradle deve-se adicionar no "build.gradle" (na parte de "dependencies") a linha abaixo
//        Defasadooo
//        compile group: 'mysql', name: 'mysql-connector-java', version: '8.0.17'
//        https://mvnrepository.com/artifact/mysql/mysql-connector-java
//        ver linha de comando atual

    public static void main(String[] args) throws SQLException {

        String urlConnection = "jdbc:mysql://localhost/digital_innovation_one";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(urlConnection, "root", "Koike_0710");
            System.out.println("SUCESSO");
        } catch (Exception e) {
            System.out.println("FALHA");
            e.printStackTrace();
        } finally {
            conn.close();
        }

//  -------------------------------------------------------------------------
//  Boas Praticas (mesma funcionalidade)

        // 2 - Definir parâmetros para se conectar ao banco de dados MySQL.
        String driver = "mysql";
        String dataBaseAddress = "localhost";
        String dataBaseName = "digital_innovation_one";
        String user = "root";
        String password = "password";

        // 3 - Construção da string de conexão.
        StringBuilder sb = new StringBuilder("jdbc:")
                .append(driver).append("://")
                .append(dataBaseAddress).append("/")
                .append(dataBaseName);

        String connectionUrl = sb.toString(); //sb.toString() == "jdbc:mysql://localhost/digital_innovation_one"

        //Carregar a classe específica de implementação do driver na memória da JVM. (A partir da versão JDBC 4 não é mais necessário!!!)
        //Class.forName("com.mysql.jdbc.Driver");

        // 4 - Criar conexão usando o DriverManager, passando como parâmetros a string de conexão, usuário e senha do usuário.
        try (Connection conn2 = DriverManager.getConnection(connectionUrl, user, password)) {
            System.out.println("SUCESSO ao se conectar ao banco MySQL!");
        } catch (SQLException e) {
            System.out.println("FALHA ao se conectar ao banco MySQL!");
            e.printStackTrace();
        }


    }
}
