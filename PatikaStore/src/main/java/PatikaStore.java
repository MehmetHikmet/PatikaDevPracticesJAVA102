public class PatikaStore {
    public static void main(String[] args){

            Brand b1 = new Brand("Samsung");
            Brand b2 = new Brand("Lenovo");
            Brand b3 = new Brand("Apple");
            Brand b4 = new Brand("Huawei");
            Brand b5 = new Brand("Casper");
            Brand b6 = new Brand("Asus");
            Brand b7 = new Brand("Xiaomi");
            Brand b8 = new Brand("HP");
            Brand b9 = new Brand("Oneplus");


            NoteBook n1 = new NoteBook(7499, 35, 10, "Asus Tuf", b6, 16, 15, 500, 0);
            NoteBook n2 = new NoteBook(8499, 35, 10, "Lenovo v14", b2, 32, 16, 1000, 0);
            NoteBook n3 = new NoteBook(12799, 35, 10, "MacBook Pro", b3, 16, 14, 512, 0);

            Phones p1 = new Phones(10799, 25, 10, "iPhone Max", b3, 16, 6, 4000, "black", 64);
            Phones p2 = new Phones(9799, 25, 10, "OnePlus 5", b9, 8, 5, 4500, "gray", 128);
            Phones p3 = new Phones(7799, 25, 10, "Samsung Note 15", b1, 32, 7, 4000, "black", 256);



            Cli.commandLine();
    }
}
