package one.innovation.digital.streams;

import one.innovation.digital.comparators.Estudante;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio {

    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 17));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("Joao", 18));
        estudantes.add(new Estudante("Thiago", 16));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 15));
        System.out.println(estudantes + "\n");

        List<Estudante> restantes = estudantes.stream().peek(
                estudante -> System.out.println("\n" + estudante.getNome() + " - " + estudante.getIdade()))
                .filter(estudante -> estudante.getIdade() >= 18).peek(estudante -> System.out.println("Maior de idade"))
                .filter(estudante -> estudante.getNome().toLowerCase().contains("o"))
                .peek(estudante -> System.out.println("Contem a letra O")).collect(Collectors.toList());

        System.out.println("\n Dos estudantes restantes: ");
        System.out.println(restantes);
        System.out.println("\t Restaram: " + restantes.stream().count());
        System.out.println("\t O mais velho: " + restantes.stream().max(Comparator.comparing(estudante -> estudante.getIdade())));
        System.out.println("\t O mais nove: " + restantes.stream().min(Comparator.comparing(estudante -> estudante.getIdade())));
        System.out.println("\t Algum com a letra d: " + restantes.stream().anyMatch(estudante -> estudante.getNome().toLowerCase().contains("d")));
    }
}
