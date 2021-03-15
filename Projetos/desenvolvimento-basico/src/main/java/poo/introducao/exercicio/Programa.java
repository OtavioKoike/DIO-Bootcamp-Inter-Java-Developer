package poo.introducao.exercicio;

public class Programa {

    public static void main(String[] args) {
        Carro fluence = new Carro("Fluence", "Renault", 2018, "2.0", 5);

        Carro palio = new Carro("Palio", "Fiat", 2012, 5);

        System.out.println(palio.adicionar());
        System.out.println(palio.adicionar());
        System.out.println(palio.adicionar());
        System.out.println(palio.adicionar());
        System.out.println(palio.adicionar());
        System.out.println(palio.adicionar());

        System.out.println(palio.retira());
        System.out.println(palio.retira());
        System.out.println(palio.retira());
        System.out.println(palio.retira());
        System.out.println(palio.retira());
        System.out.println(palio.retira());
    }
}
