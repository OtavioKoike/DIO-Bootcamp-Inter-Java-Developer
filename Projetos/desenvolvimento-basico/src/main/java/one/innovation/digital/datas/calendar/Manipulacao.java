package one.innovation.digital.datas.calendar;

import java.util.Calendar;

public class Manipulacao {

    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();

        System.out.printf("%tc\n", agora);
        //sex. mar. 12 19:33:39 BRT 2021

        System.out.printf("%tF\n", agora);
        //2021-03-12

        System.out.printf("%tD\n", agora);
        //03/12/21

        System.out.printf("%tr\n", agora);
        //07:33:39 PM

        System.out.printf("%tT\n", agora);
        //19:33:39

    }
}
