package SOLIDwithDesignPattern;

public class Thesis implements LibraryResource {
    private String title;
    private String author;
    private int year;

    public Thesis(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String getTitle() { return title; }

    @Override
    public void borrow(String patronName) {
        System.out.println(patronName + " borrowed thesis: \"" + title
            + "\" by " + author + " (" + year + ")");
    }
}