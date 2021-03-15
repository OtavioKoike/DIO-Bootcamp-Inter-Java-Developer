package one.innovation.digital.poo.introducao.exercicio;

public class Carro {

    private String modelo;
    private String marca;
    private Integer ano;
    private String variante;

    private int limitePessoas;
    private int pessoas;

    public Carro (final String modelo, final String marca, final Integer ano, final String variante, final int limitePessoas){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.variante = variante;

        this.limitePessoas = limitePessoas;
        this.pessoas = 0;
    }

    public Carro (final String modelo, final String marca, final Integer ano, final int limitePessoas){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;

        this.limitePessoas = limitePessoas;
        this.pessoas = 0;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    public int getLimitePessoas() {
        return limitePessoas;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

    public String adicionar(){
        if(getPessoas() < getLimitePessoas()){
            setPessoas(getPessoas() + 1);
            return "Pessoa Adicionada! O carro esta com " + getPessoas() + " pessoas";
        }
        else{
            return "Carro Lotado!";
        }
    }

    public String retira(){
        if(getPessoas() > 0){
            setPessoas(getPessoas() - 1);
            return "Pessoa Retirada! O carro esta com " + getPessoas() + " pessoas";
        }
        else{
            return  "Carro Vazio!";
        }
    }
}
