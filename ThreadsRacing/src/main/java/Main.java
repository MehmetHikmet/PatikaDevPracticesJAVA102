import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

public static void main(String[] args){
    List<Integer> list = new ArrayList<>();

    for(int i=0;i<10000;i++){
        list.add(i+1);
    }
    EvenNumber evenNumber = new EvenNumber(list);
    OddNumber oddNumber = new OddNumber(list);

    ExecutorService poolEvenNumbers = Executors.newFixedThreadPool(4);
    ExecutorService poolOddNumbers = Executors.newFixedThreadPool(4);

    for(int j =0; j<4;j++){
        poolEvenNumbers.execute(evenNumber);
        poolOddNumbers.execute(oddNumber);
    }
    
    poolEvenNumbers.shutdown();
    poolOddNumbers.shutdown();
}


}
