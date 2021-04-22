package one.innovation.digital.desafio2;

import java.io.IOException;
import java.util.Scanner;

public class MinhaClasse {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int impar = 0;
        int par = 0;
        int positivo = 0;
        int negativo = 0;
        int dados;

//continue a solução
        for (int i = 0; i < 5; i++) {
            dados = leitor.nextInt();
            if(dados > 0) positivo++; else if(dados < 0) negativo++;
            if(dados % 2 == 0) par++; else impar++;
        }
//insira suas variaveis corretamente
        System.out.println( par + " valor(es) par(es)");
        System.out.println( impar + " valor(es) impar(es)");
        System.out.println( positivo + " valor(es) positivo(s)");
        System.out.println( negativo + " valor(es) negativo(s)");
    }

}
