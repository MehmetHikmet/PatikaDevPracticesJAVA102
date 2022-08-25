import java.util.Scanner;

public class Cli {
    static Scanner scanner = new Scanner(System.in);
    public static void commandLine() {

        while (true) {
            System.out.println("""
                    PatikaStore Product Management Section !
                    1 - Notebook Operations
                    2 - Phone Operations
                    3 - List Brands
                    0 - Exit""");

            System.out.println("Choose an option: ");
            int command = scanner.nextInt();

            while (command > 4 || command < 0) {
                System.out.println("Enter a valid number!");
                System.out.println("Choose a number: ");
                command = scanner.nextInt();
            }

            if (command == 1) {
                NoteBook.listNotebooks();
                notebookCommands();

            } else if (command == 2) {
                Phones.listPhones();
                phoneCommands();
            } else if (command == 3) {
                Brand.listBrands();
            }
            else{
                break;
            }

        }

    }



    private static void notebookCommands() {
        while (true) {
            System.out.println("""
                    1 - Add a new notebook
                    2 - Delete a notebook
                    3 - Exit""");

            System.out.println("Choose an option: ");
            int commandForNb = scanner.nextInt();
            if (commandForNb < 1 || commandForNb > 3) {
                System.out.println("Enter a valid number!");
                System.out.println("Choose an option: ");
                commandForNb = scanner.nextInt();
            }

            if (commandForNb == 1) {
                System.out.println("Enter the name: ");
                String newNbName = scanner.next();

                System.out.println("Enter the brand: ");
                String newNbBrandName = scanner.next();
                int index = 0;
                boolean isThereSuchABrand = false;
                for (int i = 0; i < Brand.brandList.size(); i++) {
                    if (Brand.brandList.get(i).getName().equals(newNbBrandName)) {
                        isThereSuchABrand = true;
                        index = i;
                        break;
                    }
                }
                Brand newNbBrand = isThereSuchABrand ? Brand.brandList.get(index) : new Brand(newNbBrandName);

                System.out.println("Enter the price: ");
                float newNbPrice = scanner.nextFloat();
                System.out.println("Enter the storage: ");
                int newNbStorage = scanner.nextInt();
                System.out.println("Enter the screen size: ");
                int newNbScreen = scanner.nextInt();
                System.out.println("Enter the RAM: ");
                int newNbMemory = scanner.nextInt();

                new NoteBook(newNbPrice, 35, 10, newNbName, newNbBrand, newNbMemory, newNbScreen, newNbStorage, 0);
                System.out.println("New notebook is added");

            } else if (commandForNb == 2) {
                System.out.println("Enter id of the notebook");
                int id = scanner.nextInt();
                NoteBook.deleteNotebook(id);
            }
            else{
                break;
            }
        }
    }

    private static void phoneCommands() {
        while (true) {
            System.out.println("""
                    1 - Add a new phone
                    2 - Delete a phone
                    3 - Exit""");

            System.out.println("Choose an option: ");
            int commandForPhone = scanner.nextInt();
            if (commandForPhone < 1 || commandForPhone > 3) {
                System.out.println("Enter a valid number!");
                System.out.println("Choose an option: ");
                commandForPhone = scanner.nextInt();
            }

            if (commandForPhone == 1) {
                System.out.println("Enter the name: ");
                String newPhoneName = scanner.next();
                System.out.println("Enter the brand: ");
                String newPhoneBrandName = scanner.next();
                int index = 0;
                boolean isThereSuchABrand = false;
                for (int i = 0; i < Brand.brandList.size(); i++) {
                    if (Brand.brandList.get(i).getName().equals(newPhoneBrandName)) {
                        isThereSuchABrand = true;
                        index = i;
                        break;
                    }
                }
                Brand newPhoneBrand = isThereSuchABrand ? Brand.brandList.get(index) : new Brand(newPhoneBrandName);

                System.out.println("Enter the price: ");
                float newPhonePrice = scanner.nextFloat();
                System.out.println("Enter the storage: ");
                int newPhoneStorage = scanner.nextInt();
                System.out.println("Enter the screen size: ");
                int newPhoneScreen = scanner.nextInt();
                System.out.println("Enter the RAM: ");
                int newPhoneMemory = scanner.nextInt();
                System.out.println("Enter the color: ");
                String newPhoneColor = scanner.next();
                System.out.println("Enter the battery capacity");
                int newPhoneBatteryCapacity = scanner.nextInt();

                new Phones(newPhonePrice, 25, 0, newPhoneName, newPhoneBrand, newPhoneMemory, newPhoneScreen, newPhoneBatteryCapacity, newPhoneColor, newPhoneStorage);
                System.out.println("New notebook is added");

            } else if (commandForPhone == 2) {
                System.out.println("Enter id of the notebook");
                int id = scanner.nextInt();
                Phones.deletePhone(id);
            } else {
                break;
            }

        }
    }
}
