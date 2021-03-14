package poo.pilares.polimorfismo;

public class Moto extends Veiculo {

    private String cilindradas;

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    public double ipva(){
        return this.getValorVenal() * 0.03;
    }
}
