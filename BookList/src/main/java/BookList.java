public class BookList {

    private int pagesCount;
    private String bookName;
    private String writerName;
    private String publishDate;

    public int getPagesCount() {
        return pagesCount;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public BookList(int pagesCount, java.lang.String bookName, java.lang.String writerName, java.lang.String publishDate) {
        this.pagesCount = pagesCount;
        this.bookName = bookName;
        this.writerName = writerName;
        this.publishDate = publishDate;
    }
}
