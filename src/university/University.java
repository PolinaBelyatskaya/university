package university;

import universityProject.items.Department;
import universityProject.items.Faculty;
import universityProject.items.Group;
import universityProject.items.Library;
import universityProject.people.Student;
import universityProject.people.Teacher;

import java.util.Arrays;
import java.util.Objects;

public class University {

    private String name;
    private Faculty[] faculties;
    private Address address;
    private Library library;

    public University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Faculty[] getFaculties() {
        return faculties;
    }

    public void setFaculties(Faculty[] faculties) {
        this.faculties = faculties;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return Objects.equals(name, that.name) && Arrays.equals(faculties, that.faculties) && Objects.equals(address, that.address) && Objects.equals(library, that.library);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, address, library);
        result = 31 * result + Arrays.hashCode(faculties);
        return result;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", faculties=" + Arrays.toString(faculties) +
                ", address=" + address +
                ", library=" + library +
                '}';
    }


    public int calculateExpenses() {

        int result = 0;

        for (Faculty f : faculties) {
            result = result + f.calculateExpenses();
        }
        return result;
    }

    public int calculateExpenses(boolean isPremium) {

        int teacherExpenses = 0;
        int studentExpenses = 0;

        for (Faculty f : faculties) {

            if (f != null) {
//
                for (Department d : f.getDepartments()) {
                    int result = d.calculateSalaries(isPremium);
                    teacherExpenses = teacherExpenses + result;

                }
//                    for (Teacher t : d.getTeachers())
//                        if (isPremium == t.isPremium()) {
//                            teacherExpenses = teacherExpenses + t.getSalaryPerMonth();
//
//                       }

                for (Group g : f.getGroups()) {
                    int result = g.calculateScholarships(isPremium);

                    studentExpenses = studentExpenses + result;
                }
            }
//            for (Student s : students)
//
//
//                if (isPremium == s.isPremium()) {
//                    studentExpenses = studentExpenses + s.getScholarship();
//                }

        }
        int sum = teacherExpenses + studentExpenses;

        return sum;
    }
}
