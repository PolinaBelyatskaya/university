package university.items;

import university.people.Student;

public class Group {

    protected static int studentCount = 0;
    private int number;
    private Student[] students;

    public Group(){
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
}
