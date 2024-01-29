package university.items;

import university.people.Student;
import university.people.Teacher;

public class Group {

    protected static int studentCount = 0;
    private int number;
    private Student[] students;

    public Group(int number,  Student[] students){

        this.number = number;
        this.students  = students;
        studentCount++;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int calculateScholarships(){

        int result = 0;

        for (Student t : students){

            if (t != null) {
                result = result + t.getScholarship();
            }
        }

        return result;
    }

    public int calculateScholarships(boolean isPremium) {

        int result = 0;

        for (Student s : students) {

            if (s != null) {
                if (isPremium == s.isPremium()) {
                    result = result + s.getScholarship();
                }
            }
        }
        return result;

    }
}
