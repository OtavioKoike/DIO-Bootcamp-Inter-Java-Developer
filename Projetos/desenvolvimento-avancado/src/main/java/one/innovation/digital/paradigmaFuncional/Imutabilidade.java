package one.innovation.digital.paradigmaFuncional;

import java.util.function.UnaryOperator;

public class Imutabilidade {

    public static void main(String[] args) {
        int valor = 20;

        UnaryOperator<Integer> dobro = v -> v * 2;
        System.out.println(dobro.apply(valor)); //Retorna o dobro
        System.out.println(valor);  //valor nao foi alterado
    }
}
