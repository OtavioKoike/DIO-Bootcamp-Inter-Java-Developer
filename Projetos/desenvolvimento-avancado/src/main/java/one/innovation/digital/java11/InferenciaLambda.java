package one.innovation.digital.java11;

import java.util.function.Function;

public class InferenciaLambda {
    public static void main(String[] args) {
        Function<Integer, Double> divisao =  (var numero) -> numero / 2.0;
        System.out.println(divisao.apply(5));
    }
}
