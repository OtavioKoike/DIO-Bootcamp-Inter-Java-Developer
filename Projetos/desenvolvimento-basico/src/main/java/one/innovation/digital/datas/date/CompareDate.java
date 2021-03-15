package one.innovation.digital.datas.date;

import java.util.Date;

public class CompareDate {

    public static void main(String[] args) {

        Date dataNoPassado = new Date(1615576504109L); //Fri Mar 12 16:15:04 BRT 2021

        Date dataNoFuturo = new Date(1616576504109L); //Wed Mar 24 06:01:44 BRT 2021

        Date mesmaDataNoFuturo = new Date(1616576504109L); //Wed Mar 24 06:01:44 BRT 2021

        /** Comparando se as datas são iguais */
        boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo);

        System.out.println(isEquals); //true

        /** Comparando uma data com a outra */
        int compareCase1 = dataNoPassado.compareTo(dataNoFuturo); //passado -> futuro

        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado); //futuro -> passado

        int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo); //datas equivalentes

        System.out.println(compareCase1); // -1 (Menor)

        System.out.println(compareCase2); // 1 (Maior)

        System.out.println(compareCase3); // 0 (Igual)

    }
}
