package one.innovation.digital.paradigmaFuncional;

public class FuncaoComLambda {

    public static void main(String[] args) {
        Funcao prefixo = valor -> "Sr " + valor;
        System.out.println(prefixo.gerar("Otavio"));
    }
}
