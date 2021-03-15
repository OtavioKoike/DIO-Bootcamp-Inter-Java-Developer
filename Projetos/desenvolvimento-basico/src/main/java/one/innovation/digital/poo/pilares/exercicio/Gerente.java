package one.innovation.digital.poo.pilares.exercicio;

public class Gerente extends Funcionario{

    public double calculaImposto(){
        return getSalario() * 0.001;
    }
}
