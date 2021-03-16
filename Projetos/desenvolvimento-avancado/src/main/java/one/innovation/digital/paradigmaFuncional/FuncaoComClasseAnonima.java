package one.innovation.digital.paradigmaFuncional;

public class FuncaoComClasseAnonima {

    public static void main(String[] args) {
        Funcao prefixo = new Funcao() {
            @Override
            public String gerar(String valor) { return "Sr. " + valor; }
        };
        System.out.println(prefixo.gerar("Otavio"));
    }
}
