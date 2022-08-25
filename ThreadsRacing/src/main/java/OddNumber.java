import java.util.ArrayList;
import java.util.List;

public class OddNumber implements Runnable {
    List<Integer> list;

    public OddNumber(List<Integer> list) {
        this.list = list;
    }

    public synchronized List findOddNumber(List<Integer> list){
        List<Integer> oddNumberList = new ArrayList<>();

        for(int i=0; i<list.size();i++){
            if(list.get(i)%2!=0){
                oddNumberList.add(list.get(i));
            }

        }
        return oddNumberList;
    }

    @Override
    public void run() {
        List<Integer> oddNumberList = findOddNumber(this.list);

        for(int j=0;j<2500;j++){
            System.out.println("Thread : "+ Thread.currentThread().getName() + " : "+ j + " - " +oddNumberList.get(j));
        }
    }
}
