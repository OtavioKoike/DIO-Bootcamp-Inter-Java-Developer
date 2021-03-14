package caracteristicasI.classes.pessoa;

public class ProgramaPessoaFisica {

    public static void main(String[] args) {
        final PessoaFisica pessoaFisica = new PessoaFisica(22, 74.0f);
        System.out.println(pessoaFisica.relatorio());
    }
}
