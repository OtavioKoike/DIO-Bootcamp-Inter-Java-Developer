package one.innovation.digital.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        //Monta arvore com as capitais
        treeCapitais.add("Belo Horizonte"); //Adicao nao fica ordenada
        treeCapitais.add("São Paulo");
        treeCapitais.add("Belo Horizonte"); //Não adiciona repetido
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Florianopolis");
        System.out.println(treeCapitais);

        System.out.println("\n");
        System.out.println(treeCapitais.first()); //Retorna primeiro elemento da arvore
        System.out.println(treeCapitais.last()); //Retorna ultimo elemento da arvore
        System.out.println("\n");
        System.out.println(treeCapitais.lower("Florianopolis")); //Retorna o elemento abaixo/antes do elemento parametrizado
        System.out.println(treeCapitais.higher("Florianopolis")); //Retorna o elemento acima/depois do elemento parametrizado
        System.out.println(treeCapitais);
        System.out.println("\n");
        System.out.println(treeCapitais.pollFirst()); //Retorna primeiro elemento da arvore e removendo
        System.out.println(treeCapitais);
        System.out.println(treeCapitais.pollLast()); //Retorna ultimo elemento da arvore e removendo
        System.out.println(treeCapitais);
        System.out.println("\n");

        Iterator<String> capitais = treeCapitais.iterator();
        while(capitais.hasNext()){
            System.out.println(capitais.next());
        }

        System.out.println("\n");
        for (String capital: treeCapitais){
            System.out.println(capital);
        }
    }

}
