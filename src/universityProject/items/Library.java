package universityProject.items;

import universityProject.documents.Book;
import universityProject.documents.StudentID;

import java.time.LocalDate;
import java.util.Arrays;

public class Library extends UniversityUnit{

    private Book[] books;
    private StudentID[] studentIDs;


    public Library (String name, Book[] books){
        super (name);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(books, library.books) && Arrays.equals(studentIDs, library.studentIDs);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(books);
        result = 31 * result + Arrays.hashCode(studentIDs);
        return result;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                ", studentIDs=" + Arrays.toString(studentIDs) +
                '}';
    }

    public void issueBook (StudentID studentID){
        LocalDate today = LocalDate.now();
        if (studentID.getExpirationDate().isAfter(today)){
            System.out.println("Student can get a book");
        }
        else {
            System.out.println("Student can't get a book");
        }
    }
}
