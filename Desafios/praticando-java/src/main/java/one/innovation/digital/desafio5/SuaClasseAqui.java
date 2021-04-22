package one.innovation.digital.desafio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SuaClasseAqui {
    public static void main(String[] args) throws IOException {
//      Para Plataforma (Descomentar)
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      Para Teste Local (Comentar)
        Scanner ler = new Scanner(System.in);

        String password;

//      Para Plataforma (Descomentar)
//        while ((password = br.readLine()) != null) {
//      Para Teste Local (Comentar)
        while ((password = ler.nextLine()) != null) {
            boolean isCorrectLength = password.length() >= 6 && password.length() <= 32;
            boolean containsPontuation = !password.matches("^(?=.*[a-zA-Z])(?=.*[0-9])[A-Za-z0-9]+$");
            boolean containsNumber = false;
            boolean containsUpperCase = false;
            boolean containsLowerCase = false;

            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    containsNumber = true;
                } else if (Character.isUpperCase(password.charAt(i))) {
                    containsUpperCase = true;
                } else if (Character.isLowerCase(password.charAt(i))) {
                    containsLowerCase = true;
                }
            }

            if (isCorrectLength && !containsPontuation && containsNumber && containsUpperCase && containsLowerCase) {
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");
            }
        }
    }
}
