package one.innovation.digital.datas.date;

import java.util.Date;

public class Exercicio {

    public static void main(String[] args) {

        Date nascimento = new Date(907729200000l); //Wed Oct 07 00:00:00 BRT 1998
        System.out.println(nascimento);

        Date data = new Date(1273892400000l); //Sat May 15 00:00:00 BRT 2010
        System.out.println(data);

        if(nascimento.before(data)){
            System.out.println("Anterior");
        }
        else System.out.println("Posterior");
    }
}
