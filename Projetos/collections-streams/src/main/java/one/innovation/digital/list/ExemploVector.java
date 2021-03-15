package one.innovation.digital.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        esportes.add("Futebol"); //Add no List
        esportes.add("Volei");
        esportes.add("Tenis");
        esportes.add("Basquetebol");
        System.out.println(esportes);

        esportes.set(2, "Tenis de Mesa"); //Atualiza na posicao desejada
        System.out.println(esportes);

        esportes.remove(3); //Remove na posicao desejada
        System.out.println(esportes);

        esportes.remove("Volei"); //Removo o objeto desejado
        System.out.println(esportes);

        System.out.println(esportes.get(0)); //Retorna o objeto dada a posicao desejada

        //---------------------------------------------------------------------------
        System.out.println("\n");

        //Formas de percorrer vetor

        for(String esporte: esportes){
            System.out.println(esporte);
        }

    }

}
