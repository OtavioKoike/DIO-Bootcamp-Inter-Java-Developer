package one.innovation.digital.fatorial;

import java.util.HashMap;
import java.util.Map;

public class FatorialMemoization {

    //Variavel Global
    static Map<Integer, Integer> MAPA_FATORIAL = new HashMap<>();

    public static void main(String[] args) {
        long I = System.nanoTime();
        System.out.println(fatorial(15));
        long F = System.nanoTime();
        System.out.println("Tempo Fatorial 1: " + (F-I));

        I = System.nanoTime();
        System.out.println(fatorial(15));
        F = System.nanoTime();
        System.out.println("Tempo Fatorial 2: " + (F - I));
    }

    public static Integer fatorial (Integer value){
        if(value == 1){
            return value;
        }
        else{
            //Ve se ja existe no MAPA, retornando o valor ja executado anteriormente
            if(MAPA_FATORIAL.containsKey(value)){
                return MAPA_FATORIAL.get(value);
            }
            else{
                Integer resultado = value * fatorial(value - 1);
                //Adiciona no mapa para ser usado posteriormente
                MAPA_FATORIAL.put(value, resultado);
                return resultado;
            }
        }
    }
}
