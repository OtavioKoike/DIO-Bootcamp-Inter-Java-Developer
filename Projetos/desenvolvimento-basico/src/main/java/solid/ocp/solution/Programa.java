package solid.ocp.solution;

public class Programa {

    public static void main(String[] args) {
        ControladorDeDesconto controladorDeDesconto = new ControladorDeDesconto();

        DescontoLivroInfantil tresporquinhos = new DescontoLivroInfantil();
        DescontoLivroAutoAjuda fodase = new DescontoLivroAutoAjuda();
        DescontoLivroDeAcao mercenarios = new DescontoLivroDeAcao();

        controladorDeDesconto.adicionaDesconto(tresporquinhos);
        controladorDeDesconto.adicionaDesconto(fodase);
        controladorDeDesconto.adicionaDesconto(mercenarios);
    }
}
