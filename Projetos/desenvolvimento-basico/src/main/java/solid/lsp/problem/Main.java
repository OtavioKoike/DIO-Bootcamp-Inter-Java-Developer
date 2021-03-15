package solid.lsp.problem;

public class Main {

    public static void main(String[] args) {
        Retangulo retangulo = new Quadrado();

        retangulo.setAltura(10);
        retangulo.setLargura(5);

        System.out.println("Area: " + retangulo.getArea()); //ERRO no calculo
    }
}
