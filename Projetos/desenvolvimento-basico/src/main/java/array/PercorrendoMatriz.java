package array;

public class PercorrendoMatriz {

    public static void main(String[] args) {
        int[][] meuArray = {{1, 3, 5, 7}, {11, 13, 17, 19}};


        for(int i = 0; i < meuArray.length; i++){
            for (int j = 0; j < meuArray[i].length; j++){
                System.out.println(meuArray[i][j]);
            }
        }
    }
}
