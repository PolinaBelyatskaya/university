package university.items;

import university.people.Teacher;

public class Department {

    protected static int teacherCount = 0;

    private String name;
    private Teacher[] teachers;

    public Department(String name) {
        this.name = name;
        teacherCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public int calculateSalaries() {

        int result = 0;

        for (Teacher t : teachers) {

            if (t != null) {
                result = result + t.getSalaryPerMonth();
            }
        }
        return result;
    }

    public int calculateSalaries(boolean isPremium) {

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
}

