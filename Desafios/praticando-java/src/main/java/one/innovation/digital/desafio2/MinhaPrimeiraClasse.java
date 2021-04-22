package one.innovation.digital.desafio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
import java.util.stream.Collectors;

public class MinhaPrimeiraClasse {

    public static void main(String[] args) throws IOException {
//        Para Plataforma (Descomentar)
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.valueOf(br.readLine());

//      Para Teste Local (Comentar)
        Scanner ler = new Scanner(System.in);
        int N = ler.nextInt();

        while (N != 0) {
            List<String> conjunto = new ArrayList<>();
            for (int i = 0; i < N; i++)
//              Para Teste Local (Comentar)
                conjunto.add(ler.next());
//              Para Plataforma (Descomentar)
//                conjunto.add(br.readLine());

            conjunto = conjunto.stream().sorted().collect(Collectors.toList());

            String saida = "Conjunto Bom";
            for (int i = 0; i < N - 1; i++) {
                if (conjunto.get(i + 1).startsWith(conjunto.get(i))) {
                    saida = "Conjunto Ruim";
                    break;
                }
            }

            System.out.println(saida);
//          Para Teste Local (Comentar)
            N = Integer.valueOf(ler.next());
//          Para Plataforma (Descomentar)
//            N = Integer.valueOf(br.readLine());
        }
    }
}


