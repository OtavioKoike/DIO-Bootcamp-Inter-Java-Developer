package datas.localDate;

import java.time.LocalTime;

public class LocalTimes {

    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();

        System.out.println(agora);
        // 20:16:12.736107839

        LocalTime maisUmaHora = agora.plusHours(1);

        System.out.println(maisUmaHora);
        // 21:16:12.736107839

    }
}
