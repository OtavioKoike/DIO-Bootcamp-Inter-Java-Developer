package one.innovation.digital.datas.dateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleFormate {

    public static void main(String[] args) {

        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
        // 12/03/2021

    }
}
