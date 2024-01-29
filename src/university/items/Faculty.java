package university.items;

import university.documents.Timetable;
import university.people.Teacher;

public class Faculty {

    private String name;
    private Department[] departments;
    private Group[] groups;
    private Timetable timetable;
    private DeanOffice deanOffice;

    public Faculty(String name, Department[] departments, Group[] groups) {
        this.name = name;
        this.departments = departments;
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int calculateExpenses() {

        int teacherExpenses = 0;

        for (Department d : departments) {
            teacherExpenses = teacherExpenses + d.calculateSalaries();
        }

        int studentExpenses = 0;

        for (Group g : groups) {
            studentExpenses = studentExpenses + g.calculateScholarships();

        }

        int sum = teacherExpenses + studentExpenses;

        return sum;
    }

}
