package university.items;

import university.Book;
import university.documents.StudentID;

import java.time.LocalDate;

public class Library {

    private Book[] books;
    private StudentID[] studentIDs;
    private LocalDate startDate;
    private LocalDate endDate;

    public Library (Book[] books){
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public StudentID[] getStudentIDs() {
        return studentIDs;
    }

    public void setStudentIDs(StudentID[] studentIDs) {
        this.studentIDs = studentIDs;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
