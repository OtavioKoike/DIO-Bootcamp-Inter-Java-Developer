package one.innovation.digital.debug;

import one.innovation.digital.debug.imc.CalculadoraDeImc;
import one.innovation.digital.debug.pessoa.Pessoa;

public class Programa {

    public static void main(String[] args) {
        final Pessoa pessoa = new Pessoa("Otavio", 1.76, 74.0);

        final var calculadorDeImc = new CalculadoraDeImc();
        final var imc = calculadorDeImc.calcula(pessoa);

        System.out.printf("IMC = %.2f", imc);
    }
}
