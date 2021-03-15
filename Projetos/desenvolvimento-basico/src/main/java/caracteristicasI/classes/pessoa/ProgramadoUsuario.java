package caracteristicasI.classes.pessoa;

import caracteristicasI.classes.usuario.SuperUsuario;

public class ProgramadoUsuario {
    public static void main(String[] args) {
        final var batman = new SuperUsuario("batman", "1234%$#@!");

        batman.getLogin();

        //PACOTE DIFERENTE

        //batman.getSenha();    //NOK protected

        //String nomeDoCliente = batman.nome    //NOK não publico

    }
}
