package caracteristicasI.classes.usuario;

public class ProgramaDoSuperUsuario {

    public static void main(String[] args) {
        final var superUsuario = new SuperUsuario("root", "1234");

        //superUsuario.login;   //NOK private

        superUsuario.getLogin();
        superUsuario.getSenha();

        String root = superUsuario.nome;
    }
}
