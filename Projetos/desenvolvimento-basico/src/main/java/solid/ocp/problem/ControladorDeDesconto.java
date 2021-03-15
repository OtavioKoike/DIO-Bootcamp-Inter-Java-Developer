package solid.ocp.problem;

public class ControladorDeDesconto {

    public void adicionaDescontoLivroInfantil(DescontoLivroInfantil descontoLivroInfantil){
        descontoLivroInfantil.valorDescontoLivroInfantil();
    }

    public void adicionaDescontoLivroAutoAjuda(DescontoLivroAutoAjuda descontoLivroAutoAjuda){
        descontoLivroAutoAjuda.valorDescontoLivroAutoAjuda();
    }

    //Criamos esse metodo (Foi alterado)
    public void adicionaDescontoLivroAcao(DescontoLivroDeAcao descontoLivroDeAcao){
        descontoLivroDeAcao.valorDescontoLivroAcao();
    }
}
