package one.innovation.digital.fatorial;

public class FatorialRecursivo {

    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }

    public static int fatorial(int value){
        if(value == 0){
            return 1;
        }
        else{
           return value * fatorial(value-1);
        }
    }
}
