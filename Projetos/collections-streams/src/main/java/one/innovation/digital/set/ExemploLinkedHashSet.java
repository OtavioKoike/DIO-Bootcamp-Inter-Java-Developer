package one.innovation.digital.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {
        Set<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(1); //Permanece Ordem (Menos performatica)
        sequenciaNumerica.add(3);
        sequenciaNumerica.add(1); //Não adiciona repetido
        sequenciaNumerica.add(5);
        sequenciaNumerica.add(7);
        sequenciaNumerica.add(9);
        sequenciaNumerica.add(11);
        sequenciaNumerica.add(13);
        System.out.println(sequenciaNumerica);

        sequenciaNumerica.remove(13);
        System.out.println(sequenciaNumerica);

        System.out.println(sequenciaNumerica.size());

        System.out.println("\n");

        Iterator<Integer> notas = sequenciaNumerica.iterator();
        while(notas.hasNext()){
            System.out.println(notas.next());
        }

        System.out.println("\n");

        for (Integer nota: sequenciaNumerica){
            System.out.println(nota);
        }

        sequenciaNumerica.clear();
        System.out.println(sequenciaNumerica.isEmpty());
    }
}
