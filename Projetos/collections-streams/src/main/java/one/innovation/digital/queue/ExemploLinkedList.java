package one.innovation.digital.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();
        String clienteAtendido;

        filaBanco.add("Otavio");
        filaBanco.add("Augusto");
        filaBanco.add("Marques");
        filaBanco.add("Koike");
        System.out.println(filaBanco);

        clienteAtendido = filaBanco.poll(); //retorna e romeve o primeiro elemento
        //null se vazio
        System.out.println(clienteAtendido);
        System.out.println(filaBanco);

//        filaBanco.clear();

        clienteAtendido = filaBanco.peek(); //retorna, mas nao remove o primeiro elemento
        //null se vazio
        System.out.println(clienteAtendido);
        System.out.println(filaBanco);

//        filaBanco.clear();

        clienteAtendido = filaBanco.element(); //retorna, mas nao remove o primeiro elemento
        //NoSuchElementException se vazio
        System.out.println(clienteAtendido);
        System.out.println(filaBanco);

        System.out.println(filaBanco.size());
        System.out.println(filaBanco.isEmpty());

        //---------------------------------------------------------------------------
        System.out.println("\n");

        //Formas de percorrer vetor

        for(String cliente: filaBanco){
            System.out.println(cliente);
        }

        System.out.println("\n");

        Iterator<String> fila = filaBanco.iterator();
        while(fila.hasNext()){
            System.out.println(fila.next());
        }
    }
}
