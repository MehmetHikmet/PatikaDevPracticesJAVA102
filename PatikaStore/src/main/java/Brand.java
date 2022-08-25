import java.util.ArrayList;
import java.util.List;

public class Brand {

    static int idCounter = 20000;
    static List<Brand> brandList = new ArrayList<>();
    String name;
    int id;

    public Brand(String name) {
        this.name = name;
        this.id = Brand.idCounter++;
        brandList.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    public static void listBrands() {
        for (Brand brand : Brand.brandList) {
            System.out.println("- " + brand);
        }
    }
}
