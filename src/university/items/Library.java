package university.items;

import university.Book;
import university.documents.StudentID;

import java.time.LocalDate;
import java.util.Date;

public class Library {

    private Book[] books;
    private StudentID[] studentIDs;


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
