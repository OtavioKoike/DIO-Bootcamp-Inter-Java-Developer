package poo.caracteristicas.hashCode;

public abstract class Veiculo {

    private String marca;
    private String modelo;
    private double valorVenal;

    public Veiculo(String modelo, String marca, double valorVenal){
        this.modelo = modelo;
        this.marca = marca;
        this.valorVenal = valorVenal;
    }

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

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }

        Veiculo comparavel;
        if(obj instanceof Veiculo){
            comparavel = (Veiculo)obj;
        }
        else{
            return false;
        }

        if(comparavel.marca == this.marca && comparavel.modelo == this.modelo && comparavel.valorVenal == this.valorVenal){
            return true;
        }
        else{
            return false;
        }
    }
}
