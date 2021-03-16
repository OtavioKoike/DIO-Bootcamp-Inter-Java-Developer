package one.innovation.digital.fatorial;

public class FatorialTailCall {

    public static void main(String[] args) {
        System.out.println(fatorialAux(5));
    }

    public static int fatorialAux(int valor){
        return fatorialTailCall(valor, 1);
    }

    public static int fatorialTailCall(int valor, int numero){
        if(valor == 0){
            return numero;
        }
        return fatorialTailCall(valor-1, numero * valor);
    }
}
