package one.innovation.digital.poo.pilares.polimorfismo;

public class Carro extends Veiculo {

    private int quantidadePortas;

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
