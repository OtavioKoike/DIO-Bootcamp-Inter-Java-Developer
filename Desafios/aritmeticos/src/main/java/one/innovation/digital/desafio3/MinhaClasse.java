package one.innovation.digital.desafio3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class MinhaClasse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//declare as variaveis corretamente e continue a sua solução

        ArrayList<Integer> lista = new ArrayList<Integer>();

        int  quantidade  = sc.nextInt();
        while(quantidade-- > 0)
            lista.add(sc.nextInt());

        SortedMap<Integer, Integer> contaQuant = new TreeMap<>();
        lista.forEach(id -> contaQuant.compute(id, (key, value) -> (value == null ? 1 : ++value)));

        contaQuant.entrySet().forEach(entry->{
            System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());
        });

        sc.close();
    }
}
