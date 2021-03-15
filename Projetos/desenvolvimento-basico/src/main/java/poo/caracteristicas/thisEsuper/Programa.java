package poo.caracteristicas.thisEsuper;

public class Programa {

    public static void main(String[] args) {

        Carro carro = new Carro("fluence", "Renault", 1000, 4);
        System.out.println(carro.ipva()); //70

        Moto moto = new Moto("Biz", "sei la", 1000, "150");
        System.out.println(moto.ipva()); //30
    }
}
