package one.innovation.digital.interfacesFuncionais;

public class FuncaoAltaOrdem {

    public static void main(String[] args) {
        Calculo soma = (x, y) -> x + y;
        Calculo subtracao = (x, y) -> x - y;
        Calculo divisao = (x, y) -> x / y;
        Calculo multiplicacao = (x, y) -> x * y;

        System.out.println(Executar(soma, 4, 2));
        System.out.println(Executar(subtracao, 4, 2));
        System.out.println(Executar(divisao, 4, 2));
        System.out.println(Executar(multiplicacao, 4, 2));
    }

    public static double Executar(Calculo somar, int x, int y){
        return somar.calcular(x, y);
    }
}

@FunctionalInterface
interface Calculo {
    public double calcular(int x, int y);
}