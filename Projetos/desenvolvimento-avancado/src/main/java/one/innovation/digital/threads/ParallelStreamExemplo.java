package one.innovation.digital.threads;

import javax.sql.rowset.spi.SyncResolver;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExemplo {

    public static void main(String[] args) {
        long init = System.currentTimeMillis();
        IntStream.range(1,100000).forEach(num -> fatorial(num)); //Serial
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execucao Serial:" + (fim-init)); //4838

        init = System.currentTimeMillis();
        IntStream.range(1,100000).parallel().forEach(num -> fatorial(num)); //Parallel
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execucao Parallel:" + (fim-init)); //1814

        List<String> nomes =Arrays.asList("Otavio", "Augusto","Marques", "Koike");
        nomes.parallelStream().forEach(System.out::println);
    }

    public static long fatorial(long num){
        long fat = 1;

        for(long i = num; i > 0; i--){
            fat *= i;
        }
        return fat;
    }
}
