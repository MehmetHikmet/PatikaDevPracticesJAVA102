import java.util.Comparator;

public class Order implements Comparator<Books>{


    @Override
    public int compare(Books compared, Books compareTo) {
        return compared.getPages() > compareTo.getPages() ? -1 : 1;
    }
}
