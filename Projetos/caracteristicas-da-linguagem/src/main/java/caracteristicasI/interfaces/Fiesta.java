package caracteristicasI.interfaces;

public class Fiesta implements Carro, Veiculo{

    @Override
    public String marca(){ return "Ford"; }

    @Override
    public String registro(){ return "1234ABCD"; }

    @Override
    public void ligar(){    //Por ser Multipla, precisa ser implementada, pois ele não sabe qual usar
        //codigo
        //ou
        //Delegar alguma das funcoes, ou ate as duas
        Carro.super.ligar();
        Veiculo.super.ligar();
    }

}
