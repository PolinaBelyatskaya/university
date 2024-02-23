package universityProject.items;

import universityProject.items.Department;
import universityProject.items.Faculty;
import universityProject.items.Group;
import universityProject.people.Person;
import universityProject.people.Teacher;

public final class Accounting {


    public static int calculateTaxes(UniversityUnit universityUnit){

        Person[] people = universityUnit.getPersons();

        int tax = calculateTaxes(people);

        return tax;

    }


    private static int calculateTaxes(Person[] people) {

        int peopleTaxes = 0;

        for (Person p : people) {
            peopleTaxes = peopleTaxes + p.calculateTax();

        }
        return peopleTaxes;
    }
//    public static int calculateTaxes(UniversityUnit universityUnit) {
//
//        int tax = 0;
//
//        Faculty[] faculties = university.getFaculties();
//        for (Faculty faculty : faculties) {
//            Department[] departments = faculty.getDepartments();
//            for (Department department : departments) {
//                tax = tax + calculateTaxes(department.getTeachers());
//                Teacher[] teachers = department.getTeachers();
//                for (Teacher teacher : teachers) {
//                    teacher.calculateTax();
//                }
//            }
//            Group[] groups = faculty.getGroups();
//            for (Group group : groups) {
//                tax = tax + calculateTaxes(group.getStudents());
//            }
//        }
//        return tax;
//
//    }
}

