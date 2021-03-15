package poo.pilares.exercicio;

public class Supervisor extends Funcionario{

    public double calculaImposto(){
        return getSalario() * 0.0005;
    }
}
