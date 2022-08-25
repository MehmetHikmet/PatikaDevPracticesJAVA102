import java.util.ArrayList;
import java.util.List;

public class EvenNumber implements Runnable {

    List<Integer> list;

    public EvenNumber(List<Integer> list) {
        this.list = list;
    }

    public synchronized List findEvenNumber(List<Integer> list){
        List<Integer> evenNumberList = new ArrayList<>();

        for(int i=0; i<list.size();i++){
            if(list.get(i)%2==0){
                evenNumberList.add(list.get(i));
            }
        }
        return evenNumberList;
    }

    @Override
    public void run() {
        List<Integer> evenNumberList = findEvenNumber(this.list);
        for(int j=0;j<2500;j++){
            System.out.println("Thread : "+ Thread.currentThread().getName() + " : "+ j + " - " +evenNumberList.get(j));
        }
    }
}
