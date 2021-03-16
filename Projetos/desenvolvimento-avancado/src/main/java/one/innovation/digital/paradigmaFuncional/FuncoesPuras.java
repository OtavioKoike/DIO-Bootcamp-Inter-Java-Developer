package one.innovation.digital.paradigmaFuncional;

import java.util.function.BiPredicate;

public class FuncoesPuras {

    public static void main(String[] args) {
        BiPredicate<Integer, Integer> maior = (parametro, comparacao) -> parametro > comparacao;

        System.out.println(maior.test(13, 12));
        System.out.println(maior.test(12, 13));
        System.out.println(maior.test(13, 12));
        System.out.println(maior.test(12, 13));
    }
}
