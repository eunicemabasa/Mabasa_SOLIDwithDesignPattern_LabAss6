# SOLID with Design Pattern

The program simulates a student borrowing different types of library resources. Each resource type handles its own borrowing behavior, and the student does not need to know what kind of resource it is — it just borrows it.

The system works like this:

1. A `Student` is created with a name and ID.
2. The student borrows a resource through `LibraryService`.
3. `LibraryService` calls the `borrow()` method on whatever resource is passed.
4. Each resource prints its own borrowing message to the console.

## Code Structure

- **`LibraryResource` (Interface):** Defines the `getTitle()` and `borrow()` methods that all resource types must follow.
- **`Book`:** A physical book with a title and author.
- **`Journal`:** A printed journal with a title and issue number.
- **`AudioBook`:** An audio recording with a title and duration in minutes.
- **`EJournal`:** An online journal with a title and URL.
- **`Thesis`:** A research thesis with a title, author, and year.
- **`Newspaper`:** A newspaper with a title and issue date.
- **`LibraryService`:** Handles the borrowing process by calling `borrow()` on any `LibraryResource`.
- **`Student`:** Represents a library patron who borrows resources through `LibraryService`.
- **`Main`:** The entry point that creates a student and borrows all resource types.

## UML Class Diagram
![Image](https://github.com/tricialabbao/SOLID-with-Design-Pattern/blob/main/SOLID%20with%20Design%20Pattern.png)
