package caracteristicasI.interfaces;

public class Programa {

    public static void main(String[] args) {
        final Gol gol = new Gol();
        System.out.println("Marca Gol: " + gol.marca());
        gol.ligar();

        final Veiculo trator = new Trator();
        System.out.println("Registro Trator: " + trator.registro());
        trator.ligar();

        final Fiesta fiesta = new Fiesta();
        System.out.println("Marca Fiesta: " + fiesta.marca());
        System.out.println("Registro Fiesta: " + fiesta.registro());
        fiesta.ligar();

        //Carro.super.ligar();    //So pode ser acessado por quem implementa
    }
}
