package datas.date;

import java.time.Instant;
import java.util.Date;

public class InstanteDate {

    public static void main(String[] args) {

        Date dataInicio = new Date(1615576504109L);
        System.out.println(dataInicio);
        //Fri Mar 12 16:15:04 BRT 2021

        Instant instant = dataInicio.toInstant();
        System.out.println(instant);
        //2021-03-12T19:15:04.109Z
    }
}
