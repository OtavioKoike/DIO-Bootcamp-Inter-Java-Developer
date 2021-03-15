package one.innovation.digital.caracteristicasI.statics;

public class Programa {

    public static void main(String[] args) {
        final Cachorro pitbull = new Cachorro();
        pitbull.zoologia = "Bipede";

        final Cachorro viralatas = new Cachorro();

        System.out.println(pitbull.zoologia);
        System.out.println(viralatas.zoologia);

        System.out.println(Cachorro.late());    //Não precisa instanciar
    }
}
