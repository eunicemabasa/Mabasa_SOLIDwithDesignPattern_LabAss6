package SOLIDwithDesignPattern;

public class Student {
    private String name;
    private int studentId;
    private LibraryService libraryService;

    public Student(String name, int studentId, LibraryService libraryService) {
        this.name = name;
        this.studentId = studentId;
        this.libraryService = libraryService;
    }

    public void borrow(LibraryResource resource) {
        libraryService.borrow(resource, name);
    }

    public String getName() { return name; }
    public int getStudentId() { return studentId; }
}