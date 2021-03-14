package poo.introducao;

public class ExemploInstaciaObjeto {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        Pessoa pessoaNome = new Pessoa("Koike");

        pessoa.setNome("Otavio Koike");

        System.out.println(pessoa.getNome());
        System.out.println(pessoaNome.getNome());
    }
}
