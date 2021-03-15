package one.innovation.digital.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("Joao");

        for(String nome: nomes){
            System.out.println(nome);
        }

        System.out.println("-----------------");
        nomes.set(2, "Roberto");
        System.out.println(nomes);

        System.out.println("-----------------");
        System.out.println(nomes.get(0));

        System.out.println("-----------------");
        nomes.remove(3);
        System.out.println(nomes);

        System.out.println("-----------------");
        nomes.remove("Joao");
        System.out.println(nomes);

        System.out.println("-----------------");
        System.out.println(nomes.size());

        System.out.println("-----------------");
        System.out.println(nomes.contains("Juliano"));

        System.out.println("\n");

        List<String> nomesAux = new ArrayList<>();
        nomesAux.add("Ismael");
        nomesAux.add("Rodrigo");

        System.out.println("-----------------");
        System.out.println(nomesAux);

        System.out.println("-----------------");
        nomes.addAll(nomesAux);
        System.out.println(nomes);

        System.out.println("-----------------");
        Collections.sort(nomes);
        System.out.println(nomes);

        System.out.println("-----------------");
        System.out.println(nomes.isEmpty());

    }

}
