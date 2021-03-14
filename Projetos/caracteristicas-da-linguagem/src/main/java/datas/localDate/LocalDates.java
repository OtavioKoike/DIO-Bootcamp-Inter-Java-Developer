package datas.localDate;

import java.time.LocalDate;

public class LocalDates {

    public static void main(String[] args) {

        java.time.LocalDate hoje = java.time.LocalDate.now();

        java.time.LocalDate ontem = hoje.minusDays(1);

        System.out.println(hoje);
        // 2021-03-12

        System.out.println(ontem);
        // 2021-03-11

    }
}
