package poo.introducao;

public class Pessoa {

    private String nome = "Otavio";

    public Pessoa(){} //Pode ser implicito ou explicito

    public Pessoa(final String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String falarNome(){
        return "Olá meu nome é " + getNome();
    }

    public String andar(){
        return "Andando";
    }
}
