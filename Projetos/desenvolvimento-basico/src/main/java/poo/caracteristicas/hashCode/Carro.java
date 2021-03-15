package poo.caracteristicas.hashCode;

public class Carro extends Veiculo {

    private int quantidadePortas;

    public Carro(String modelo, String marca, double valorVenal){
        super(modelo, marca, valorVenal);
    }

    public Carro(String modelo, String marca, double valorVenal, int quantidadePortas){
        super(modelo, marca, valorVenal);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public double ipva(){
        return this.getValorVenal() * 0.07;
    }
}
