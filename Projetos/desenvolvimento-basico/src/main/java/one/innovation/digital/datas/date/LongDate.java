package one.innovation.digital.datas.date;

import java.util.Date;

public class LongDate {

    //Espera que voce passe os milissegundos com base padrao de tempo que usa como referencia
    //1 de janeiro de 1970 00:00:00

    public static void main(String[] args) {

        Long currentTimeMillis = System.currentTimeMillis(); //Retorna os milissegundos mais proximos

        System.out.println(currentTimeMillis);
        // 1615576504109

        Date novaData = new Date(currentTimeMillis);

        System.out.println(novaData);
        // Fri Mar 12 16:15:04 BRT 2021

    }
}
