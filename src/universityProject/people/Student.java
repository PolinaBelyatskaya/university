package universityProject.people;

import universityProject.documents.RecordBook;
import universityProject.documents.StudentID;

import java.util.Objects;

public class Student extends Person {

    private RecordBook recordBook;
    private StudentID studentID;
    private int scholarship;
    private static boolean isPremium;


    protected static int studentCount = 0;
    protected static int premiumStudentCount = 0;

    public Student(String firstName, String lastName, int tax) {
        super(firstName, lastName, tax);
        studentCount++;
    }


    public RecordBook getRecordBook() {
        return recordBook;
    }

    public void setRecordBook(RecordBook recordBook) {
        this.recordBook = recordBook;
    }

    public StudentID getStudentID() {
        return studentID;
    }

    public void setStudentID(StudentID studentID) {
        this.studentID = studentID;
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return scholarship == student.scholarship && Objects.equals(recordBook, student.recordBook) && Objects.equals(studentID, student.studentID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), recordBook, studentID, scholarship);
    }

    @Override
    public String toString() {
        return "Student{" +
                "recordBook=" + recordBook +
                ", studentID=" + studentID +
                ", scholarship=" + scholarship +
                '}';
    }

    public static void premiumStudentCount (){

        if (isPremium){
            premiumStudentCount++;
        }
        else {
            premiumStudentCount--;
        }
    }

    @Override
    public int  calculateTax(){

        int tax;

        if(isPremium){
            tax = scholarship/10;
        }
        else{
            tax = scholarship*20/100;
        }

        return tax;
    }
}
