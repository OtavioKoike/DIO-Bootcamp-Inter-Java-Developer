package one.innovation.digital.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploArrayList {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(); //Criar um List

        nomes.add("Otavio");    //Add no List
        nomes.add("Augusto");
        nomes.add("Marques");
        nomes.add("Koike");
        System.out.println(nomes);

        Collections.sort(nomes); //Ordenaçao em ordem alfabetica
        System.out.println(nomes);

        nomes.set(3, "Otávio"); //Atualiza na posicao desejada
        System.out.println(nomes);

        nomes.remove(2); //Remove na posicao desejada
        System.out.println(nomes);

        nomes.remove("Augusto"); //Removo o objeto desejado
        System.out.println(nomes);

        String nome = nomes.get(1); //Retorna o objeto dada a posicao desejada
        System.out.println(nome);
        // Erro IndexOutBoundsException caso nao exista o indixe passado

        int posicao = nomes.indexOf("Otávio"); //Retorna o indice do elemento passado
        System.out.println(posicao);
        //-1 Se nao existe

        int tamanho = nomes.size(); //Retorna a quantidade de elementos na lista
        System.out.println(tamanho);

        boolean tem = nomes.contains("Koike"); //Retorna se tem elemento na lista
        System.out.println(tem);

        nomes.clear(); //Limpa a lista

        boolean vazio = nomes.isEmpty(); //Retorna se lista esta vazia ou nao
        System.out.println(vazio);

        //---------------------------------------------------------------------------
        System.out.println("\n");

        nomes.add("Otavio");
        nomes.add("Augusto");
        nomes.add("Marques");
        nomes.add("Koike");

        //Formas de percorrer vetor

        for(String nomeItem: nomes){
            System.out.println(nomeItem);
        }

        System.out.println("\n");

        Iterator<String> iterator = nomes.iterator();
        while(iterator.hasNext()){  //hasNext retorna true caso haja um item na iteração
            System.out.println(iterator.next()); //next retorna o elemento naquela iteração

        }
    }
}
