package SOLIDwithDesignPattern;

public class AudioBook implements LibraryResource {
    private String title;
    private int durationMinutes;

    public AudioBook(String title, int durationMinutes) {
        this.title = title;
        this.durationMinutes = durationMinutes;
    }

    @Override
    public String getTitle() { return title; }

    @Override
    public void borrow(String patronName) {
        System.out.println(patronName + " borrowed audiobook: " + title
            + " (" + durationMinutes + " mins)");
    }
}