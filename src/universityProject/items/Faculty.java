package universityProject.items;

import universityProject.documents.Timetable;
import universityProject.people.Teacher;

import java.util.Arrays;
import java.util.Objects;

public class Faculty extends UniversityUnit {

    private Department[] departments;
    private Group[] groups;
    private Timetable timetable;
    private DeanOffice deanOffice;

    public Faculty(String name, Department[] departments, Group[] groups) {
        super(name);
        this.departments = departments;
        this.groups = groups;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public Timetable getTimetable() {
        return timetable;
    }

    public void setTimetable(Timetable timetable) {
        this.timetable = timetable;
    }

    public DeanOffice getDeanOffice() {
        return deanOffice;
    }

    public void setDeanOffice(DeanOffice deanOffice) {
        this.deanOffice = deanOffice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return Arrays.equals(departments, faculty.departments) && Arrays.equals(groups, faculty.groups) && Objects.equals(timetable, faculty.timetable) && Objects.equals(deanOffice, faculty.deanOffice);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(timetable, deanOffice);
        result = 31 * result + Arrays.hashCode(departments);
        result = 31 * result + Arrays.hashCode(groups);
        return result;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "departments=" + Arrays.toString(departments) +
                ", groups=" + Arrays.toString(groups) +
                ", timetable=" + timetable +
                ", deanOffice=" + deanOffice +
                '}';
    }

    @Override
    public int calculateExpenses() {

        int teacherExpenses = 0;

        for (Department d : departments) {
            teacherExpenses = teacherExpenses + d.calculateExpenses();
        }

        int studentExpenses = 0;

        for (Group g : groups) {
            studentExpenses = studentExpenses + g.calculateExpenses();

        }

        int sum = teacherExpenses + studentExpenses;

        return sum;
    }

    public int calculateExpenses(boolean isPremium) {

        int teacherExpenses = 0;

        for (Department d : departments) {
            teacherExpenses = teacherExpenses + d.calculateExpenses();
        }

        int studentExpenses = 0;

        for (Group g : groups) {
            studentExpenses = studentExpenses + g.calculateExpenses();
        }

        int sum = teacherExpenses + studentExpenses;
        return sum;

    }

}
