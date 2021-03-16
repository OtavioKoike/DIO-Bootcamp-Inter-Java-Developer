package one.innovation.digital.paradigmaFuncional;

public class Aula {

    public static void main(String[] args) {
        FuncaoString funcao = valor -> { return valor + " Koike"; };

        System.out.println(funcao.gerar("Otavio"));

    }
}

@FunctionalInterface
interface FuncaoString{
    String gerar(String valor);
}
