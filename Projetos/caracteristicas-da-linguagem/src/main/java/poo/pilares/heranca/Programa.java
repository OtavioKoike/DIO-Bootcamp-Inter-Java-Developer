package poo.pilares.heranca;

public class Programa {

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.setModelo("fluence");
        carro.setMarca("Renault");
        carro.setQuantidadePortas(4);

        Moto moto = new Moto();
        moto.setModelo("Biz");
        moto.setMarca("sei la");
        moto.setCilindradas("150");
    }
}
