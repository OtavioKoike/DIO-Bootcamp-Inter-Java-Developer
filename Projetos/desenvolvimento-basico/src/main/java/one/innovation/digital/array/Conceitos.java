package one.innovation.digital.array;

public class Conceitos {

    public static void main(String[] args) {

        int[] meuArray = new int[7];
        int[] meuArray2 = {1, 3, 5, 7, 11, 13, 17};

        System.out.println(meuArray); //Lugar na memoria
        System.out.println(meuArray2);  //Lugar na memoria

        System.out.println(meuArray[3]);    //o
        System.out.println(meuArray2[3]);   //7

        meuArray[3] = 7;
        System.out.println(meuArray[3]);    //7

        System.out.println(meuArray.length);    //7
    }
}
