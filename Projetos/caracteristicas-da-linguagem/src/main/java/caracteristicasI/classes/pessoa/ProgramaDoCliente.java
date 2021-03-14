package caracteristicasI.classes.pessoa;

import caracteristicasI.classes.cliente.Cliente;

public class ProgramaDoCliente {

    public static void main(String[] args) {
        final var cliente = new Cliente(22, 74.0f);

        cliente.getIdade();
        cliente.getPeso();

        System.out.println(cliente.relatorio());    //OK mesmo pacote
    }
}
