package SOLIDwithDesignPattern;

public class Newspaper implements LibraryResource {
    private String title;
    private String issueDate;

    public Newspaper(String title, String issueDate) {
        this.title = title;
        this.issueDate = issueDate;
    }

    @Override
    public String getTitle() { return title + " (" + issueDate + ")"; }

    @Override
    public void borrow(String patronName) {
        System.out.println(patronName + " borrowed newspaper: " + title
            + ", issue date: " + issueDate);
    }
}