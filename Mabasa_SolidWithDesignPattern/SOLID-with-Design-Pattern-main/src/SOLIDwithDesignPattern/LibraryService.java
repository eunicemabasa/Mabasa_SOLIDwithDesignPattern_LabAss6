package SOLIDwithDesignPattern;

public class LibraryService {
    public void borrow(LibraryResource resource, String patronName) {
        resource.borrow(patronName);
    }
}