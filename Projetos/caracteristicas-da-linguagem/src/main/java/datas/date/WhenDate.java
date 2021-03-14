package datas.date;

import java.util.Date;

public class WhenDate {

    public static void main(String[] args) {

        Date dataNoPassado = new Date(1615576504109L);
        //Fri Mar 12 16:15:04 BRT 2021

        Date dataNoFuturo = new Date(1616576504109L);
        //Wed Mar 24 06:01:44 BRT 2021

        /** Comparando se a dataNoPassado é posterior a dataNoFuturo */
        boolean isAfter = dataNoPassado.after(dataNoFuturo);

        System.out.println(isAfter);
        //false

        /** Comparando se a dataNoPassado é anterior a dataNoFuturo */
        boolean isBefore = dataNoPassado.before(dataNoFuturo);

        System.out.println(isBefore);
        //true

    }
}
