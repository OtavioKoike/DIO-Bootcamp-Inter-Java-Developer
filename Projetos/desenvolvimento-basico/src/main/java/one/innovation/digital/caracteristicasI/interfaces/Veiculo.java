package one.innovation.digital.caracteristicasI.interfaces;

public interface Veiculo {

    String registro();

    default void ligar(){
        System.out.println("Ligando Veiculo!");
    }

}
