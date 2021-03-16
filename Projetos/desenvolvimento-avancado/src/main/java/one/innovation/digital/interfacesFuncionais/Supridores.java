package one.innovation.digital.interfacesFuncionais;

import java.util.function.Supplier;

public class Supridores {

    public static void main(String[] args) {
        //Retorna algo, nao precisa de parametro
        Supplier<Pessoa> instancia = Pessoa::new;

        System.out.println(instancia.get());
    }
}

class Pessoa{
    private String nome;
    private Integer idade;

    public Pessoa(){
        nome = "Otavio";
        idade = 22;
    }

    //O toString da Object iria retornar um @hash desse objeo
    //dessa forma é mais visual
    @Override
    public String toString(){
        return String.format("nome: %s, idade: %d", nome, idade);
    }
}
