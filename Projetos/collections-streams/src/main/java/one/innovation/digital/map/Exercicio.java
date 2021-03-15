package one.innovation.digital.map;

import java.util.HashMap;
import java.util.Map;

public class Exercicio {

    public static void main(String[] args) {
        Map<String , String> estados = new HashMap<>();

        estados.put("AC", "Acre");
        estados.put("AL", "Alagoas");
        estados.put("AP", "Amapa");
        estados.put("AM", "Amazonas");
        estados.put("BA", "Bahia");
        estados.put("CE", "Ceara");
        estados.put("ES", "Espirito Santo");
        estados.put("GO", "Goias");
        estados.put("MA", "Maranhao");
        estados.put("MT", "Mato Grosso");
        estados.put("MS", "Mato Grosso do Sul");
        estados.put("MG", "Minas Gerais");
        estados.put("PA", "Para");
        estados.put("PB", "Paraiba");
        estados.put("PR", "Parana");
        estados.put("PE", "Pernambuco");
        estados.put("PI", "Piaui");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("RN", "Rio Grande do Norte");
        estados.put("RS", "Rio Grande do Sul");
        estados.put("RO", "Rondonia");
        estados.put("RR", "Roraima");
        estados.put("SC", "Santa Catarina");
        estados.put("SP", "Sao Paulo");
        estados.put("SE", "Sergipe");
        estados.put("TO", "Tocantins");

        estados.remove("MG");
        estados.put("DF", "Distrito Federal");

        System.out.println(estados.size());
        System.out.println("\n");

        for(Map.Entry<String, String> entry: estados.entrySet()){
            System.out.println(entry.getValue() + " (" + entry.getKey() +")");
        }

        System.out.println("\n");
        System.out.println(estados.containsKey("SC"));
        System.out.println(estados.containsValue("Maranhao"));
    }
}
