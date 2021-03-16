package one.innovation.digital.interfacesFuncionais;

import java.util.function.Consumer;

public class Consumidores {

    public static void main(String[] args) {
        Consumer<String> imprimeFrase = frase -> System.out.println(frase);
        Consumer<String> imprimeReference = System.out::println;

        imprimeFrase.accept("Hello World!");
        imprimeReference.accept("Hello World!");

    }
}
