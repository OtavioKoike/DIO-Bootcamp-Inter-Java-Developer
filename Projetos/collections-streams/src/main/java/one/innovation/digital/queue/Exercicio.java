package one.innovation.digital.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Exercicio {

    public static void main(String[] args) {
        Queue<String> nomes = new LinkedList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("Joao");

        for(String nome: nomes){
            System.out.println(nome);
        }

        System.out.println(nomes.element());
        System.out.println(nomes);

        System.out.println(nomes.poll());
        System.out.println(nomes);

        nomes.add("Daniel");
        System.out.println(nomes);

        System.out.println(nomes.size());
        System.out.println(nomes.isEmpty());
        System.out.println(nomes.contains("Carlos"));
    }
}
