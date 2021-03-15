package caracteristicasI.tipos.tipagem;

public class TipagemEstatica {

    public static void main(String[] args) {

        //Integer numero = "123456789"; //ERRO de compilação

        String texto = "meu texto";
        //texto = 1000 //NOK

        Integer numero = Integer.valueOf("1024");
        numero = 512; //OK
    }
}
