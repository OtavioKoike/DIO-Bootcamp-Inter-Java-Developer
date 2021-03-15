package caracteristicasI.enums;

public class Programa {

    public static void main(String[] args) {
        //final TipoVeiculo tipoVeiculo = new TipoVeiculo();  //Enums nao podem ser instanciados

        System.out.println(TipoVeiculo.TERRESTRE);
        System.out.println(TipoVeiculo.AQUATICO);

        //System.out.println(TipoVeiculo.valueOf("aereo")); //ERRO nome nao existe
        System.out.println(TipoVeiculo.valueOf("AEREO"));

        for (TipoVeiculo tipo : TipoVeiculo.values()){
            System.out.println("Tipo:" + tipo);
        }

        System.out.println("Codigo CLOSE: " + Status.CLOSE.getCod());
        System.out.println("Texto OPEN:" + Status.OPEN.getTexto());
    }
}
