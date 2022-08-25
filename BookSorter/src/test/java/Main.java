import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args){
        Set<Books> books = new TreeSet<>();
        books.add(new Books("Math", 260));
        books.add(new Books("Phys", 540));
        books.add(new Books("Macbeth", 80));
        books.add(new Books("Hamlet", 144));
        books.add(new Books("King Lear", 130));

        for (Books b : books){
            System.out.println(b);
        }



        Set<Books> orderedByPages = new TreeSet<>(new Order());
        orderedByPages.addAll(books);
        for (Books b : orderedByPages){
            System.out.println(b);
        }
    }
}
