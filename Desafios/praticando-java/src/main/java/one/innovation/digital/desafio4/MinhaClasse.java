package one.innovation.digital.desafio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MinhaClasse{
    public static void main(String[] args) throws IOException {
//      Para Plataforma (Descomentar)
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//      Para Teste Local (Comentar)
        Scanner ler = new Scanner(System.in);

        String proximaPalavra;

//      Para Plataforma (Descomentar)
//        while((proximaPalavra = br.readLine()) != null) {
//      Para Teste Local (Comentar)
        while((proximaPalavra = ler.nextLine()) != null) {
            boolean encontrouRepeticao = false;
            for(int i=0; i <= proximaPalavra.length() - 1; i++) {
                if( proximaPalavra.substring(0, i).endsWith(proximaPalavra.substring(i)) ) {
                    System.out.println(proximaPalavra.substring(0, i));
                    encontrouRepeticao = true;
                }
            }
            if(!encontrouRepeticao)
                System.out.println(proximaPalavra);
        }
    }
}