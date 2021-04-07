package one.innovation.digital.desafio2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
import java.util.stream.Collectors;

public class MinhaPrimeiraClasse {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int N = ler.nextInt();

        while (N != 0) {
            List<String> conjunto = new ArrayList<>();
            for (int i = 0; i < N; i++)
                conjunto.add(ler.next());

            conjunto = conjunto.stream().sorted().collect(Collectors.toList());

            String saida = "Conjunto Bom";
            for (int i = 0; i < N - 1; i++) {
                if (conjunto.get(i + 1).startsWith(conjunto.get(i))) {
                    saida = "Conjunto Ruim";
                    break;
                }
            }

            System.out.println(saida);
            N = Integer.valueOf(ler.next());
        }
    }
}


