package one.innovation.digital.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

    public static void main(String[] args) {

        List<String> estudantes = new ArrayList<>();

        estudantes.add("Otavio");
        estudantes.add("Augusto");
        estudantes.add("Marques");
        estudantes.add("Koike");

//        Retorna uma instancia da classe stream para a colecao
//        estudantes.stream()

        //Retorna o numero de elementos do stream
        System.out.println("Contagem: " + estudantes.stream().count());

        //Retorna o elemento com maior numero de letras do stream
        System.out.println("Maior numero de letras: "
                + estudantes.stream().max(Comparator.comparing(String::length)));

        //Retorna o elemento com menor numero de letras do stream
        System.out.println("Menor numero de letras: "
                + estudantes.stream().min(Comparator.comparing(String::length)));

        //Retorna uma colecao com os elementos com a letra O
        System.out.println("Com O no nome: "
                + estudantes.stream().filter(
                        (estudante)-> estudante.contains("o")) //Regra que retorna true or false //Se true, vai para uma nova colecao
                        .collect(Collectors.toList())); //Pegamos a colecao retornada e convertemos para lista

        //Retorna uma colecao com nome e quantidade de letras
        System.out.println("Quantidade de letras: "
                + estudantes.stream().map( //Retorna uma colecao do mesmo tamanho alterada
                        (estudante) -> estudante.concat(" -- ")
                                .concat(String.valueOf(estudante.length())))
                                .collect(Collectors.toList()));

        //Retorna os X numeros de elementos
        System.out.println("3 Primeiros elementos: "
                + estudantes.stream().limit(3).collect(Collectors.toList()));

        //Exibe todos elementos
        //Retorna a mesma lista sem alteração
        System.out.println("Estudantes (Peek): ");
        System.out.println("Estudantes(Peek Retorno): "
                + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        //Exibe todos elementos
        //Não retorna nada
        System.out.println("Estudantes (ForEach): ");
        estudantes.forEach((estudante) -> System.out.println(estudante));

        //Retorna true se todos elementos tem w no nome
        System.out.println("Todos contem W: "
                + estudantes.stream().allMatch((elemento) -> elemento.contains("w")));

        //Retorna true se algum elemento tem M no nome
        System.out.println("Algum contem M: "
                + estudantes.stream().anyMatch((elemento) -> elemento.contains("M")));

        //Retorna true se nenhum elemento tem w no nome
        System.out.println("Não contem W: "
                + estudantes.stream().noneMatch((elemento) -> elemento.contains("w")));

        //Retorna primeiro elemento, se existir exibi o nome
        estudantes.stream().findFirst().ifPresent((estudante) -> System.out.println("Primeiro Estudante: " + estudante));

        estudantes.add("Jorge");

        //Exemplo de operacao encadeada
        System.out.println("Operacao encadeada");
        System.out.println(estudantes.stream()
            .peek(System.out::println)
                .map(estudante ->
                        estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter(estudante -> estudante.toLowerCase().contains("o"))
//                .collect(Collectors.toList()));
//                .collect(Collectors.joining(", ")));
//                .collect(Collectors.toSet()));
                .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1))));
    }

}
