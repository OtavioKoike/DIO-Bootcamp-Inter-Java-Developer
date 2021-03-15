package one.innovation.digital.caracteristicasI.finals;

public class Programa {

    public static void main(String[] args) {
        final HardcoreGamer hardcoreGamer = new HardcoreGamer();
        final Gamer gamer = new Gamer();
        final CasualGamer casualGamer = new CasualGamer();
        final var game = "FIFA";

        //game = "Wow"; //NOK não pode alterar valor da variavel final

        System.out.println(casualGamer.play(game));
    }
}
