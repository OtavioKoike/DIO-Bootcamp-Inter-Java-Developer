package one.innovation.digital.optionals;

import java.util.Optional;

public class Exercicio {

    public static void main(String[] args) {

        Optional<Integer> optionalInteger = Optional.of(7);
        Optional<Integer> optionalNull = Optional.ofNullable(null);
        Optional<Integer> optionalEmpty = Optional.empty();

        optionalInteger.ifPresentOrElse(System.out::println, ()-> System.out.println("Optional vazio"));

//        optionalNull.orElseThrow(IllegalStateException::new);

        optionalNull.ifPresentOrElse(System.out::println ,()-> System.out.println("Optional vazio"));

        optionalInteger.map((valor)-> valor *=valor).ifPresent(System.out::println);

        if(optionalInteger.isPresent()){
            Integer valor = optionalInteger.get();
            System.out.println(valor);
        }


    }
}
