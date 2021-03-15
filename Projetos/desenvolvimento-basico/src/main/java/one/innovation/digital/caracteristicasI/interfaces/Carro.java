package one.innovation.digital.caracteristicasI.interfaces;

public interface Carro extends Automovel{

    String marca(); //Classe abstrata, modificador de acesso implicita (mesma da interface)

    //Double valor();   //Ao inserir quebra as outras implementações

    default void ligar(){
        System.out.println("Ligando carro!");
    }

    default String codigoRenava(){  //Ao inserir não quebra as outras implementacoes
        return "987654321";
    }
}
