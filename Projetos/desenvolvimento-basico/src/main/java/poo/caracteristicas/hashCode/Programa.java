package poo.caracteristicas.hashCode;

public class Programa {

    public static void main(String[] args) {
        Veiculo carro1 = new Carro("Palio", "Fiat", 2000);
        Veiculo carro2 = new Carro("Palio", "Fiat", 2000);

        System.out.println(carro1.equals(carro2)); //Equals sobrescrito em Veiculo
    }
}
