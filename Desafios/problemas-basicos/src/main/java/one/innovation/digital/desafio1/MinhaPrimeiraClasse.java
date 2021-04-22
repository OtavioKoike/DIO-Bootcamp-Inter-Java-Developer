package one.innovation.digital.desafio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MinhaPrimeiraClasse {
    public static void main(String[] args) throws IOException {
//        Para Plataforma (Descomentar)
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int a = Integer.parseInt(st.nextToken());

//        st = new StringTokenizer(br.readLine());
//        int b = Integer.parseInt(st.nextToken());

//      Para Teste Local (Comentar)
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite dois numeros:");
        int a = ler.nextInt();
        int b = ler.nextInt();

//      Ambos (Deixar)
        int total = a * b; // Altere o valor da variável com o cálculo esperado
        System.out.println("PROD = " + total);
    }
}
