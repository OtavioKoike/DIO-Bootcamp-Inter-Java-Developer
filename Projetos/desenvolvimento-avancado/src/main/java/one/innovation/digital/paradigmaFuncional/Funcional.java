package one.innovation.digital.paradigmaFuncional;

import java.util.function.UnaryOperator;

public class Funcional {

    public static void main(String[] args) {
        //Paradigma Funcional
        UnaryOperator<Integer> calcularValor = valorfuncional -> valorfuncional * 3;
        int valorFuncional = 10;
        System.out.println("Resultado: " + calcularValor.apply(valorFuncional));
    }
}
