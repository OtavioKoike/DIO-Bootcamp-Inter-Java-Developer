package datas.calendar;

import java.util.Calendar;

public class Instance {

    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();
        System.out.println(agora);

        //SAIDA
        /*java.util.GregorianCalendar[
            time=1615588019115,
            areFieldsSet=true,
            areAllFieldsSet=true,
            lenient=true,
            zone=sun.util.calendar.ZoneInfo[
                id="America/Sao_Paulo",
                offset=-10800000,
                dstSavings=0,
                useDaylight=false,
                transitions=93,
                lastRule=null
            ],
            firstDayOfWeek=1,
            minimalDaysInFirstWeek=1,
            ERA=1,
            YEAR=2021,
            MONTH=2,
            WEEK_OF_YEAR=11,
            WEEK_OF_MONTH=2,
            DAY_OF_MONTH=12,
            DAY_OF_YEAR=71,
            DAY_OF_WEEK=6,
            DAY_OF_WEEK_IN_MONTH=2,
            AM_PM=1,
            HOUR=7,
            HOUR_OF_DAY=19,
            MINUTE=26,
            SECOND=59,
            MILLISECOND=115,
            ZONE_OFFSET=-10800000,
            DST_OFFSET=0
        ]*/
    }
}
