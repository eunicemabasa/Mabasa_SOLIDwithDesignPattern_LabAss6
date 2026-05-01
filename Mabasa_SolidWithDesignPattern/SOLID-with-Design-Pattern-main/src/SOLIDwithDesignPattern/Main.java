package SOLIDwithDesignPattern;

public class Main {
    public static void main(String[] args) {
        LibraryService service = new LibraryService();
        Student student = new Student("Tricia Labbao", 2024001, service);

        student.borrow(new Book("Clean Code", "Robert C. Martin"));
        student.borrow(new Journal("IEEE Software", 42));
        student.borrow(new AudioBook("The Pragmatic Programmer", 480));
        student.borrow(new EJournal("Nature", "https://nature.com"));
        student.borrow(new Thesis("Effects of Social Media on Academic Performance",
            "Juan dela Cruz", 2023));
        student.borrow(new Newspaper("Philippine Daily Inquirer", "April 15, 2026"));
    }
}