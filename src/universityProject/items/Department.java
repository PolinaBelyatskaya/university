package universityProject.items;

import universityProject.IExpenses;
import universityProject.ITax;
import universityProject.people.Person;
import universityProject.people.Teacher;

import java.util.Arrays;

public class Department extends UniversityUnit implements ITax, IExpenses {

    private Teacher[] teachers;

    public Department(String name) {
        super(name);
    }


    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Arrays.equals(teachers, that.teachers);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(teachers);
    }

    @Override
    public String toString() {
        return "Department{" +
                "teachers=" + Arrays.toString(teachers) +
                '}';
    }

    @Override
    public int calculateExpenses() {

        int result = 0;

        for (Teacher t : teachers) {

            if (t != null) {
                result = result + t.getSalaryPerMonth();
            }
        }
        return result;
    }

    @Override
    public int calculateExpenses(boolean isPremium) {

        int result = 0;

        for (Teacher t : teachers) {

            if (t != null) {
                if (isPremium == t.isPremium()) {
                    result = result + t.getSalaryPerMonth();
                }
            }
        }
        return result;

    }

    @Override
    public int calculateTax(){

        int tax = 0;

        for (Teacher t : teachers) {

            if (t != null) {
                tax = tax + t.calculateTax();
            }
        }
        return tax;
    }

    @Override
    public Person[] getPersons(){
        return getTeachers();
    }
}

