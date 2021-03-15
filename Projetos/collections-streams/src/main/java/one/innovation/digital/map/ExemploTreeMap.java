package one.innovation.digital.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

    public static void main(String[] args) {
        TreeMap<String, String> treeCapitais = new TreeMap<>();

        //Monta arvore com as capitais
        treeCapitais.put("MG", "Belo Horizonte"); //Adicao nao fica ordenada
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("SC", "Florianopolis");
        treeCapitais.put("PR", "Curitiba");
        System.out.println(treeCapitais);

        System.out.println("\n");
        System.out.println(treeCapitais.firstKey()); //Retorna primeira chave da arvore
        System.out.println(treeCapitais.lastKey()); //Retorna ultima chave da arvore
        System.out.println("\n");
        System.out.println(treeCapitais.lowerKey("SC")); //Retorna a chave abaixo/antes da chave parametrizado
        System.out.println(treeCapitais.higherKey("SC")); //Retorna a chave acima/depois da chave parametrizado
        System.out.println(treeCapitais);
        System.out.println("\n");

        //Retorna primeiro elemento da arvore (Chave e valor)
        System.out.println(treeCapitais.firstEntry().getKey() + " -- " + treeCapitais.firstEntry().getValue());
        //Retorna ultimo elemento da arvore (Chave e valor)
        System.out.println(treeCapitais.lastEntry().getKey() + " -- " + treeCapitais.lastEntry().getValue());
        System.out.println("\n");

        System.out.println(treeCapitais);
        Map.Entry<String, String> primeiro = treeCapitais.pollFirstEntry();
        System.out.println(primeiro.getKey() + " -- " + primeiro.getValue());
        System.out.println(treeCapitais);
        Map.Entry<String, String> ultimo = treeCapitais.pollLastEntry();
        System.out.println(ultimo.getKey() + " -- " + ultimo.getValue());
        System.out.println(treeCapitais);

        //---------------------------------------------------------------------------
        System.out.println("\n");

        //Formas de percorrer vetor

        Iterator<String> capitais = treeCapitais.keySet().iterator();
        while(capitais.hasNext()){
            String key = capitais.next();
            System.out.println(key + " -- " + treeCapitais.get(key));
        }

        System.out.println("\n");
        for (String capital: treeCapitais.keySet()){
            System.out.println(capital + " -- " + treeCapitais.get(capital));
        }

        System.out.println("\n");
        for (Map.Entry<String, String> capital : treeCapitais.entrySet()){
            System.out.println(capital.getKey() + " -- " + capital.getValue());
        }
    }
}
