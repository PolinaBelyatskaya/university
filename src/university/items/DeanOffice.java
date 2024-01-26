package university.items;

import university.documents.RecordBook;
import university.people.Student;

public class DeanOffice {

    private String name;
    private Student[] students;
    private RecordBook[] recordBooks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public RecordBook[] getRecordBooks() {
        return recordBooks;
    }

    public void setRecordBooks(RecordBook[] recordBooks) {
        this.recordBooks = recordBooks;
    }

    public void admissionToExam(RecordBook recordBook) {
        int mark = recordBook.getMark();
        if (mark > 4) {
            System.out.println("student admitted to the exam");
        } else {
            System.out.println("student is not admitted to the exam");
        }
    }

    public void calculateScholarship(RecordBook recordBook){
        int mark = recordBook.getMark();
        if (mark < 2){
            System.out.println("student is not getting scholarship");
        }
    }
}
