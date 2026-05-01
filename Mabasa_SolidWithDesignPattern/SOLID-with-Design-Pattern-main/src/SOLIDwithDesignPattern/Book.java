package SOLIDwithDesignPattern;

public class Book implements LibraryResource {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String getTitle() { return title; }

    @Override
    public void borrow(String patronName) {
        System.out.println(patronName + " borrowed book: " + title);
    }
}