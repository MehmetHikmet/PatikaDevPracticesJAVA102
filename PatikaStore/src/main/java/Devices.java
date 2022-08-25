public class Devices {
    int id;
    static int uniqueID = 10000;
    float price;
    int stock;
    float discount;
    String name;
    Brand brand;
    int memory;
    int screenSize;


    public Devices(float price, int stock, float discount, String name, Brand brand, int memory, int screenSize) {
        this.id = Devices.uniqueID++;
        this.price = price;
        this.stock = stock;
        this.discount = discount;
        this.name = name;
        this.brand = brand;
        this.memory = memory;
        this.screenSize = screenSize;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}
