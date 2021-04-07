package one.innovation.digital.desafio4;

import java.io.IOException;
import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        String proximaPalavra;

        while((proximaPalavra = ler.next()) != null) {
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
