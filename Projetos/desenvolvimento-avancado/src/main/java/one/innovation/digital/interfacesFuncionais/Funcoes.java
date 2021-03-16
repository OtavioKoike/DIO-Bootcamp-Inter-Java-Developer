package one.innovation.digital.interfacesFuncionais;

import java.util.function.Function;

public class Funcoes {

    public static void main(String[] args) {

        //Envia um String e retorna um String
        Function<String, String> contrario = texto -> new StringBuilder(texto).reverse().toString();
        //Envia uma String e retorna um Inteiro
        Function<String, Integer> converter = texto -> Integer.valueOf(texto) * 2;
        //Metodo de reference
        Function<String, Integer> converterReference = Integer::valueOf;

        System.out.println(contrario.apply("Otavio"));
        System.out.println(converterReference.apply("20"));
        System.out.println(converter.apply("20"));
    }
}
