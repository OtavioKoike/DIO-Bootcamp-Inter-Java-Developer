package one.innovation.digital.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExampleList {

    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("Joao", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        System.out.println("--- Ordem de Insercao ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println("\n--- Ordem natural dos numeros (Idade) ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println("\n--- Ordem reversa dos numeros (Idade) ---");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println("\n--- Ordem natural dos numeros (Idade) (method reference) ---");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("\n--- Ordem revesa dos numeros (Idade) (method reference) ---");
        System.out.println(estudantes);

        Collections.sort(estudantes);
        System.out.println("\n--- Ordem natural dos numeros (Idade) (Interface Comparable) ---");
        System.out.println(estudantes);

        Collections.sort(estudantes, new EstudanteReversoComparator());
        System.out.println("\n--- Ordem reversa dos numeros (Idade) (Interface Comparator) ---");
        System.out.println(estudantes);

    }
}
