package universityProject.items;

import universityProject.people.Person;
import universityProject.people.Student;
import universityProject.people.Teacher;

import java.util.Arrays;

public class Group extends UniversityUnit {

    private Student[] students;

    public Group(String name, Student[] students) {
        super(name);
        this.students = students;
    }


    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Arrays.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(students);
    }

    @Override
    public String toString() {
        return "Group{" +
                "students=" + Arrays.toString(students) +
                '}';
    }

    @Override
    public int calculateExpenses() {

        int result = 0;

        for (Student t : students) {

            if (t != null) {
                result = result + t.getScholarship();
            }
        }

        return result;
    }

    @Override
    public int calculateExpenses(boolean isPremium) {

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

    @Override
    public int calculateTax() {

        int tax = 0;

        for (Student s : students) {

            if (s != null) {
                tax = tax + s.calculateTax();
            }
        }
        return tax;
    }

    @Override
    public Person[] getPersons() {
        return getStudents();
    }
}
