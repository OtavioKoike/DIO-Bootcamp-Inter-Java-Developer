package poo.pilares.heranca;

public class Veiculo {

    private String marca;
    private String modelo;

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

    public String acelera(){
        return "Acelerando!";
    }
}
