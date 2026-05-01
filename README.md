# SOLID Principles with Design Pattern

This program models a scenario where a student borrows various types of library materials. Each type of resource is responsible for its own borrowing behavior, so the student doesn’t need to know the specific type of item being borrowed — it simply requests the borrow operation.

## How the system works

A student is initialized with a name and an ID.
When the student wants to borrow an item, the request is handled through a LibraryService.
The service then invokes the borrow() method on the given resource.
Each resource type implements its own version of borrow(), displaying a message appropriate to that resource.

# Code Structure
## LibraryResource (Interface)
- Defines the contract that all resource types must follow, including getTitle() and borrow() methods.
## Book
- Represents a physical book with attributes such as title and author.
## Journal
- Represents a printed journal identified by a title and issue number.
## AudioBook
- Represents an audio resource with a title and duration in minutes.
## EJournal
- Represents a digital journal with a title and a URL.
## Thesis
- Represents an academic thesis containing a title, author, and publication year.
## Newspaper
- Represents a newspaper with a title and issue date.
## LibraryService
- Manages the borrowing process by delegating the request to the appropriate resource.
## Student
- Represents a library user who borrows resources via the LibraryService.
## Main
- The entry point of the application, where a student is created and different types of resources are borrowed.

# UML Class Diagram
![Image](https://github.com/eunicemabasa/Mabasa_SOLIDwithDesignPattern_LabAss6/blob/main/UMLDiagram.png)
