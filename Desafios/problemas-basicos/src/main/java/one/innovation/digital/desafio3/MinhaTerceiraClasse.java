package one.innovation.digital.desafio3;

import java.util.Scanner;

public class MinhaTerceiraClasse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        for (int i = 0; i <= num; i++) {
            if(i % 2 != 0)
                System.out.println(i);
        }
    }
}
