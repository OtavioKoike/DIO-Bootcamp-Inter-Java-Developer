package one.innovation.digital.optionals;

import java.util.Optional;

public class ExemploOptionalEstados {

    public static void main(String[] args) {

        //Certeza que tem valor
        Optional<String> optionalString = Optional.of("Valor presente");

        System.out.println("Valor opcional que está presente");
        //If, retorna o primeiro argumento (Expressao lambda). Else, retorna o segundo agumento (Expressao lambda)
        //Como e diferente de null, vai entrar no primeiro argumento
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não esta presente"));

        //-------------------------------------------------------------------------

        //Pode ter valor ou null
        //Ele verifica se o valor é null ou não, caso null cria com empty
        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Valor opcional que não está presente");
        //If, retorna o primeiro argumento (Expressao lambda). Else, retorna o segundo agumento (Expressao lambda)
        //Como e null, vai entrar no segundo argumento
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = Não esta presente"));

        //-------------------------------------------------------------------------

        //Criar vazio
        //Cria diretamente no empty
        Optional<String> optionalEmpty = Optional.empty();

        System.out.println("Valor opcional que não está presente");
        //If, retorna o primeiro argumento (Expressao lambda). Else, retorna o segundo agumento (Expressao lambda)
        //Como e empty, vai entrar no segundo argumento
        optionalEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("empty = Não esta presente"));

        //-------------------------------------------------------------------------

//        ERRO
//        Optional<String> optionalErro = Optional.of(null);
//
//        System.out.println("Valor opcional que nao está presente");
//        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não esta presente"));
    }
}
