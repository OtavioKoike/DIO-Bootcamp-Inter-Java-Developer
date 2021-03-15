package one.innovation.digital.solid.lsp.problem;

public class Quadrado extends Retangulo{

    @Override
    public void setAltura(double altura){
        super.setAltura(altura);
        super.setLargura(altura);
    }

    @Override
    public void setLargura(double largura){
        super.setAltura(largura);
        super.setLargura(largura);
    }
}
