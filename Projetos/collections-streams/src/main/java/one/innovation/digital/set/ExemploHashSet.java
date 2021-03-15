package one.innovation.digital.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(5.8); //Adicao nao fica ordenada (Mais performatico)
        notasAlunos.add(1.4);
        notasAlunos.add(5.8); //Não adiciona repetido
        notasAlunos.add(6.2);
        notasAlunos.add(9.7);
        notasAlunos.add(4.1);
        notasAlunos.add(6.0);
        notasAlunos.add(10.0);
        System.out.println(notasAlunos);

        notasAlunos.remove(10.0);
        System.out.println(notasAlunos);

        System.out.println(notasAlunos.size());

        System.out.println("\n");

        Iterator<Double> notas = notasAlunos.iterator();
        while(notas.hasNext()){
            System.out.println(notas.next());
        }

        System.out.println("\n");

        for (Double nota: notasAlunos){
            System.out.println(nota);
        }

        notasAlunos.clear();
        System.out.println(notasAlunos.isEmpty());
    }
}
