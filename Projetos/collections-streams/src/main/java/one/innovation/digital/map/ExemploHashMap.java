package one.innovation.digital.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {

        Map<String, Integer> campeoes = new HashMap<>();

        campeoes.put("Brasil", 5); //Add no Map //Não mantem a ordem
        campeoes.put("Alemanha", 4);
        campeoes.put("Italia", 4);
        campeoes.put("Uruguai", 2);
        campeoes.put("Argentina", 2);
        campeoes.put("Franca", 2);
        campeoes.put("Inglaterra", 1);
        campeoes.put("Espanha", 1);

        System.out.println(campeoes);

        campeoes.put("Brasil", 6); //Atualiza o valor para a chave passada
        System.out.println(campeoes);

        System.out.println(campeoes.get("Argentina")); //Retorna o valor do elemento para a chave passada
        System.out.println(campeoes.containsKey("Franca")); //Retorna se existe a chave passada
        System.out.println(campeoes.containsValue(6));  //Retorna se existe o valor passado

        campeoes.remove("Franca"); //Remove elemento para a chave passada
        System.out.println(campeoes);

        System.out.println(campeoes.size()); //Retorna tamanho do Map

        //---------------------------------------------------------------------------
        System.out.println("\n");

        //Formas de percorrer vetor

        for(Map.Entry<String , Integer> entry : campeoes.entrySet()){
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        System.out.println("\n");

        for(String key: campeoes.keySet()){
            System.out.println(key + " -- " + campeoes.get(key));
        }

        campeoes.clear();
        System.out.println(campeoes.size());
    }
}
