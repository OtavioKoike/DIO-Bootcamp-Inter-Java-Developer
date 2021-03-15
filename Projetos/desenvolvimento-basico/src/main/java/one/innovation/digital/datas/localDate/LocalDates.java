package one.innovation.digital.datas.localDate;

import java.time.LocalDate;

public class LocalDates {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        LocalDate ontem = hoje.minusDays(1);

        System.out.println(hoje);
        // 2021-03-12

        System.out.println(ontem);
        // 2021-03-11

    }
}
