package one.innovation.digital.interfacesFuncionais;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {

    public static void main(String[] args) {
        String[] nomes = {"Otavio", "Augusto", "Marques", "Koike"};
        Integer[] numeros = {1,2,3,4,5};

        imprimirFiltrados(nomes);
        imprimirFiltradosStreams(nomes);
        imprimirTodos(nomes);
        imprimirTodosStream(nomes);

        imprimirDobro(numeros);
        imprimirDobroStream(numeros);

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Testador");
        profissoes.add("Gerente de projeto");
        profissoes.add("Gerente de qualidade");

        profissoes.stream().filter(p -> p.startsWith("Gerente")).forEach(System.out::println);

    }

    public static void imprimirFiltrados(String... nomes){
        String nomesImprimir = "";
        System.out.println("Nomes For: ");
        for(int i = 0; i < nomes.length; i++){
            if(nomes[i].equals("Otavio")){
                nomesImprimir += " " + nomes[i];
            }
        }
        System.out.println(nomesImprimir);
    }

    public static void imprimirFiltradosStreams(String... nomes){
        //Pega um array de String e transforma em um string só
        String resultado = Stream.of(nomes).filter(nome-> nome.equals("Otavio"))
                .collect(Collectors.joining());

        System.out.println("Nomes Stream: " + resultado);
    }

    public static void imprimirTodos(String... nomes){
        System.out.println("Todos nomes for: ");
        for(String nome: nomes){
            System.out.println(nome);
        }
    }

    public static void imprimirTodosStream(String... nomes){
        System.out.println("Todos nomes Strem: ");
        Stream.of(nomes).forEach(System.out::println);
    }

    public static void imprimirDobro(Integer... numeros){
        System.out.println("Dobro for: ");
        for(Integer numero: numeros){
            numero *= 2;
            System.out.println(numero);
        }
    }

    public static void imprimirDobroStream(Integer... numeros){
        System.out.println("Dobro Stream: ");
        Stream.of(numeros).map(numero -> numero * 2).forEach(System.out::println);
    }
}
