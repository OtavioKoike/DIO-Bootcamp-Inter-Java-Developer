package poo.pilares.encapsulamento;

public class Programa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Otavio", 07, 10, 1998);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getDataNascimento());
        System.out.println(pessoa.idade());

        pessoa.setNome("Otavio Koike");
        System.out.println(pessoa.getNome());
    }
}
