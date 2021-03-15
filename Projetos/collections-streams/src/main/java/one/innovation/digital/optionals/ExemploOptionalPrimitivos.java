package one.innovation.digital.optionals;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptionalPrimitivos {

    public static void main(String[] args) {
        System.out.println("Valor inteiro opcional");
        OptionalInt.of(7).ifPresent(System.out::println);

        System.out.println("Valor double opcional");
        OptionalDouble.of(12.3).ifPresent(System.out::println);

        System.out.println("Valor long opcional");
        OptionalLong.of(1425445786897089976l).ifPresent(System.out::println);
    }
}
