import java.util.ArrayList;
import java.util.List;

public class NoteBook extends Devices{
    private static final List<NoteBook> notebookList = new ArrayList<>();
    private Integer ssdStorage;
    private Integer hddStorage;

    public NoteBook(float price, int stock, float discount, String name, Brand brand, int memory, int screenSize, Integer ssdStorage, Integer hddStorage) {
        super(price, stock, discount, name, brand, memory, screenSize);
        this.ssdStorage = ssdStorage;
        this.hddStorage = hddStorage;
        notebookList.add(this);
    }

    public Integer getSsdStorage() {
        return ssdStorage;
    }

    public void setSsdStorage(Integer ssdStorage) {
        this.ssdStorage = ssdStorage;
    }

    public Integer getHddStorage() {
        return hddStorage;
    }

    public void setHddStorage(Integer hddStorage) {
        this.hddStorage = hddStorage;
    }



    public static void listNotebooks() {
        System.out.println("""
                Notebook List

                ----------------------------------------------------------------------------------------------------
                |    ID |                      Name |       Price |   Brand |  Storage |  Screen |   RAM |
                ----------------------------------------------------------------------------------------------------
                """);

        for (NoteBook notebook : NoteBook.notebookList) {
            System.out.printf("""
                    | %d | %25s | %8.2f TL | %7s | %8d | %7s | %5d |
                    """, notebook.getId(), notebook.getName(), notebook.getPrice(), notebook.getBrand().getName(),
                    notebook.getSsdStorage(), notebook.getScreenSize(), notebook.getMemory());
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    public static void deleteNotebook(int id) {
        for (int i = 0; i < notebookList.size(); i++) {
            if (notebookList.get(i).getId() == id) {
                NoteBook o = notebookList.get(i);
                o = null;
                notebookList.remove(i);
                System.out.println("Notebook is deleted");
                listNotebooks();
                break;
            }
        }
    }
}
