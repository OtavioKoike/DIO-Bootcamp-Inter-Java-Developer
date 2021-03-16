package one.innovation.digital.paradigmaFuncional;

import java.util.Arrays;

public class ComposicaoFuncoes {

    public static void main(String[] args) {
        int[] valores = {0, 1, 2, 3, 4};

        //Paradigma Funcional
        Arrays.stream(valores)
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero * 2)
                .forEach(System.out::println);

        System.out.println("\n");

        //Paradigma Imperativo

        for (int i = 0; i < valores.length; i++){
            int valor;
            if(valores[i] % 2 == 0){
                valor = valores[i] * 2;
                System.out.println(valor);
            }
        }
    }
}
