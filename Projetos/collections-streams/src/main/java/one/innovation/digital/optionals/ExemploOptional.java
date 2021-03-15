package one.innovation.digital.optionals;

import java.util.Optional;

public class ExemploOptional {

    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.of("valor presente");

        System.out.println(stringOptional.isEmpty());
        System.out.println(stringOptional.isPresent());

        stringOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Não presente"));

        if(stringOptional.isPresent()){
            String  valor = stringOptional.get();
            System.out.println(valor);
        }

        stringOptional.map((valor) -> valor.concat(" OK")).ifPresent(System.out::println);

        //Se nao estiver presente, lanca uma excessao
        stringOptional.orElseThrow(IllegalAccessError::new);

    }
}
