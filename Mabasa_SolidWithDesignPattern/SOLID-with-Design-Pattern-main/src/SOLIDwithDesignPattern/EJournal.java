package SOLIDwithDesignPattern;

public class EJournal implements LibraryResource {
    private String title;
    private String url;

    public EJournal(String title, String url) {
        this.title = title;
        this.url = url;
    }

    @Override
    public String getTitle() { return title; }

    @Override
    public void borrow(String patronName) {
        System.out.println(patronName + " accessed e-journal: " + title
            + " at " + url);
    }
}