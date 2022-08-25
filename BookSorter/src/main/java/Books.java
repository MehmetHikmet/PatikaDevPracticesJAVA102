public class Books implements Comparable<Books>{

    private String name;
    private int pages;

    public Books(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public int compareTo(Books comparedBooks) {
        return this.name.compareTo(comparedBooks.getName());
        //return this.bookName.compareTo(comparedBook.getBookName()) < 0 ? -1 : 1;
    }

    @Override
    public String toString(){
        return this.name + " : " + this.pages;
    }
}
