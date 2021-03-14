package datas.localDate;

import java.time.LocalDateTime;

public class LocalDateTimes {

    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora);
        // 2021-03-12T20:16:57.791579761

        LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);

        System.out.println(futuro);
        // 2021-03-14T21:17:09.791579761

    }
}
