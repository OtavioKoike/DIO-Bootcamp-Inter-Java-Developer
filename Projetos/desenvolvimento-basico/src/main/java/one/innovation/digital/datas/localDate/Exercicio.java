package one.innovation.digital.datas.localDate;

import java.time.LocalDateTime;

public class Exercicio {

    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.of(2010, 05, 15, 10, 00, 00);

        System.out.println(agora);
        // 2010-05-15T10:00

        LocalDateTime futuro = agora.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println(futuro);
        // 2014-11-15T23:00

    }
}
