package poo.pilares.polimorfismo;

public class Veiculo {

    private String marca;
    private String modelo;
    private double valorVenal;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValorVenal() {
        return valorVenal;
    }

    public void setValorVenal(double valorVenal) {
        this.valorVenal = valorVenal;
    }

    public String acelera(){
        return "Acelerando!";
    }

    public double ipva(){
        return this.valorVenal * 0.01;
    }
}
