package universityProject.items;

import universityProject.documents.RecordBook;
import universityProject.people.Student;

import java.util.Arrays;

public class DeanOffice extends UniversityUnit{



    private Student[] students;
    private RecordBook[] recordBooks;

    public DeanOffice(String name) {
        super(name);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeanOffice that = (DeanOffice) o;
        return Arrays.equals(students, that.students) && Arrays.equals(recordBooks, that.recordBooks);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(students);
        result = 31 * result + Arrays.hashCode(recordBooks);
        return result;
    }

    @Override
    public String toString() {
        return "DeanOffice{" +
                "students=" + Arrays.toString(students) +
                ", recordBooks=" + Arrays.toString(recordBooks) +
                '}';
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
