import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {


    public static void main(String[] args){
        ArrayList<BookList> list = new ArrayList<BookList>();
        list.add(new BookList(12,"Math","Mehmet Hikmet Demirci","21-08-2022"));
        list.add(new BookList(112,"Phys","Mehmet Hikmet Demirci","21-08-2022"));
        list.add(new BookList(126,"Chemistry","Mehmet Hikmet Demirci","21-08-2022"));
        list.add(new BookList(162,"History","Mehmet Hikmet Demirci","21-08-2022"));
        list.add(new BookList(22,"Music","Mehmet Hikmet Demirci","21-08-2022"));
        list.add(new BookList(120,"Macbeth","William Shakespeare","21-08-1815"));
        list.add(new BookList(132,"King Lear","William Shakespeare","21-08-1816"));
        list.add(new BookList(125,"Hamlet","William Shakespeare","21-08-1817"));
        list.add(new BookList(612,"Ulyses","James Joyce","21-08-1855"));
        list.add(new BookList(12,"Math","Mehmet Hikmet Demirci","21-08-2022"));


        HashMap<String, String> booksWithName = new HashMap<>(10);
        list.forEach(bookList -> booksWithName.put(bookList.getBookName(), bookList.getWriterName()));

        List<BookList> books = list.stream().filter(bookList -> bookList.getPagesCount()>100).toList();
        
    }


}
