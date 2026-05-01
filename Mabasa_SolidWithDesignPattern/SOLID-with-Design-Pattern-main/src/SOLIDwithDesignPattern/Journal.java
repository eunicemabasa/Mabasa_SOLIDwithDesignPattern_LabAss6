package SOLIDwithDesignPattern;

public class Journal implements LibraryResource {
    private String title;
    private int issueNumber;

    public Journal(String title, int issueNumber) {
        this.title = title;
        this.issueNumber = issueNumber;
    }

    @Override
    public String getTitle() { return title + " (Issue " + issueNumber + ")"; }

    @Override
    public void borrow(String patronName) {
        System.out.println(patronName + " borrowed journal: " + getTitle());
    }
}