import java.util.ArrayList;
import java.util.List;

public class Phones extends Devices{
    private final static List<Phones> phoneList = new ArrayList<>();
    int batteryCapacity;
    String color;
    int storage;

    public Phones(float price, int stock, float discount, String name, Brand brand, int memory, int screenSize, int batteryCapacity, String color, int storage) {
        super(price, stock, discount, name, brand, memory, screenSize);
        this.batteryCapacity = batteryCapacity;
        this.color = color;
        this.storage = storage;
        phoneList.add(this);
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void listPhones() {
        System.out.println("""
                Phone List

                ----------------------------------------------------------------------------------------------------
                |    ID |                      Name |       Price |   Brand |  Storage |  Screen |   RAM | Color |
                ----------------------------------------------------------------------------------------------------
                """);
        for (Phones phone : Phones.phoneList) {
            System.out.printf("""
                    | %d | %25s | %8.2f TL | %7s | %8d | %7s | %5d | %5s |
                    """, phone.getId(), phone.getName(), phone.getPrice(), phone.getBrand().getName(),
                    phone.getStorage(), phone.getScreenSize(), phone.getMemory(), phone.getColor());
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    public static void deletePhone(int id) {
        for (int i = 0; i < phoneList.size(); i++) {
            if (phoneList.get(i).getId() == id) {
                Phones o = phoneList.get(i);
                o = null;
                phoneList.remove(i);
                System.out.println("Phone is deleted");
                listPhones();
                break;
            }
        }
    }

}
