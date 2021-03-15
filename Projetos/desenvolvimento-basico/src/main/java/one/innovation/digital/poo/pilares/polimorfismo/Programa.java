package one.innovation.digital.poo.pilares.polimorfismo;

public class Programa {

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.setModelo("fluence");
        carro.setMarca("Renault");
        carro.setQuantidadePortas(4);
        carro.setValorVenal(1000);
        System.out.println(carro.ipva()); //70

        Moto moto = new Moto();
        moto.setModelo("Biz");
        moto.setMarca("sei la");
        moto.setCilindradas("150");
        moto.setValorVenal(1000);
        System.out.println(moto.ipva()); //30
    }
}
