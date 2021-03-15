package one.innovation.digital.debug.imc;

import one.innovation.digital.debug.pessoa.Pessoa;

public class CalculadoraDeImc {

    /**
     * MENOR QUE 18,5       MAGREZA         0
     * ENTRE 18,5 E 24,9    NORMAL          0
     * ENTRE 25,0 E 29,9    SOBREPESO       I
     * ENTRE 30,0 E 39,9    OBESIDADE       II
     * MAIOR QUE 40,0       OBESIDADE GRAVE III
     */
    public Double calcula(final Pessoa pessoa) {
        final var altura = pessoa.getAltura();
        final var imc = pessoa.getPeso() / (altura * altura);

        return imc;
    }
}
