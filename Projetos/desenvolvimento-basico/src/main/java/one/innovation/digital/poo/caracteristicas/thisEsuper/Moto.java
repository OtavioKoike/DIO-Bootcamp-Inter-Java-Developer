package one.innovation.digital.poo.caracteristicas.thisEsuper;

public class Moto extends Veiculo {

    private String cilindradas;

    public Moto(String modelo, String marca, double valorVenal){
        super(modelo, marca, valorVenal);
    }

    public Moto(String modelo, String marca, double valorVenal, String cilindradas){
        super(modelo, marca, valorVenal);
        this.cilindradas = cilindradas;
    }

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
