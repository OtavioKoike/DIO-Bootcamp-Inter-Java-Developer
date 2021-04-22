package one.innovation.digital.desafio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MinhaClasse {
    public static void main(String[] args) throws IOException {
//        Para Plataforma (Descomentar)
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        int c = Integer.parseInt(st.nextToken());
//        int d = Integer.parseInt(st.nextToken());
//        br.close();

//      Para Teste Local (Comentar)
        Scanner ler = new Scanner(System.in);

        int a = ler.nextInt();
        int b = ler.nextInt();
        int c = ler.nextInt();
        int d = ler.nextInt();

//      Ambos

        //declare suas variaveis com o valor correto
        int  resultado = -1;

//continue o codigo
        if (a != b && c != d){
            int fim = c;
            int inicio = a;

            while(inicio<=fim){
                if(inicio % a == 0 && inicio % b != 0 && c % inicio == 0 && d % inicio != 0){
                    resultado = inicio;
                    break;
                }

                inicio += a;

            }
        }
        System.out.println(resultado);
    }
}