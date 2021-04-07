package one.innovation.digital.java10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

//Var nao pode ser utilizado em nivel de classe

public class InferenciaExemplo {

    public static void main(String[] args){
        printarNome("joao", "Silva");
        printarSoma(5, 7);
        connectOracle();
    }

    public static void connectOracle(){

        try {
            var url = new URL("https://docs.oracle.com/");
            var urlConnection = url.openConnection();
            try (var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))){
                System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
            }catch (Exception e){ e.printStackTrace(); }
        }catch (Exception e){ e.printStackTrace();}
    }

    //var nao pode usar como parametro
    public static void printarNome(String nome, String sobrenome){
        var nomeCompleto = String.format("%s %s", nome, sobrenome);
        System.out.println(nomeCompleto);
    }

    public static void printarSoma(int... numeros ){
        //var nao pode ser utilizada em variaveis nao inicializadas
        var soma = 0;
        if(numeros.length > 0){
            for (var numero : numeros){
                soma += numero;
            }

            System.out.println(soma);
        }
    }
}
