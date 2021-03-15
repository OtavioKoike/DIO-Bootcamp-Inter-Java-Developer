package datas.calendar;

import java.util.Calendar;

public class Exercicio {

    public static void main(String[] args) {

        //Vencimento hoje
        Calendar vencimento = Calendar.getInstance();

        //10 dias para pagamento
        vencimento.add(Calendar.DATE, 10);

        //Verificar final de semana
        if(vencimento.get(Calendar.DAY_OF_WEEK) == 1){
            vencimento.add(Calendar.DATE, 1);
        }
        if(vencimento.get(Calendar.DAY_OF_WEEK) == 7){
            vencimento.add(Calendar.DATE, 2);
        }

        //Ultimo dia de Pagamento
        System.out.printf("Ultimo dia para pagar: %tD\n", vencimento);
    }
}
