package one.innovation.digital.desafio3;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        String string1, string2, min, max; //declare suas variaveis aqui

        while ((string1 = ler.next()) != null) { // complete seu código
            string2  = ler.next();
            if (string1.length() < string2.length()) {
                min = string1;
                max = string2;
            } else {
                min = string2;
                max = string1;
            }
            int minLength = min.length();
            int maxS = minLength;
            boolean f = true;
            while (maxS > 0 && f) { //altere as variaveis, se achar necessario
                int diff = minLength - maxS;
                for (int i = 0; i <= diff; i++) { //complete o laco de repeticao
                    if (max.contains(min.substring(i, i + maxS))) {
                        f = false;
                        maxS++;
                        break;
                    }
                }
                maxS--;
            }
            System.out.println(maxS);
        }
    }
}
