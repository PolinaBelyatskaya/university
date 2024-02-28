package universityProject;

import universityProject.documents.Book;
import universityProject.items.*;
import universityProject.people.Person;
import universityProject.people.Student;
import universityProject.people.Teacher;
import universityProject.items.University;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Sam", "Smith",  "bachelor");
        teacher1.setSalaryPerMonth(300);

        Teacher teacher2 = new Teacher("Emily", "Simmons", "master");
        teacher2.setSalaryPerMonth(500);

        Teacher teacher3 = new Teacher("Nicole", "Flores", "doctorate");
        teacher3.setSalaryPerMonth(900);

        Teacher teacher4 = new Teacher("Emma", "Watson", "bachelor");
        teacher4.setSalaryPerMonth(450);

        Teacher teacher5 = new Teacher("Eli", "Rose", "master");
        teacher5.setSalaryPerMonth(550);

        Teacher teacher6 = new Teacher("Joey", "Rivers", "doctorate");
        teacher6.setSalaryPerMonth(950);

        Teacher[] teachers = new Teacher[3];
        teachers[0] = teacher1;
        teachers[1] = teacher2;
        teachers[2] = teacher3;

        Teacher[] teachers1 = new Teacher[3];
        teachers1[0] = teacher4;
        teachers1[1] = teacher5;
        teachers1[2] = teacher6;

        Student student1 = new Student("Peter", "Bryant");
        student1.setScholarship(100);

        Student student2 = new Student("Douglas", "Ward");
        student2.setScholarship(200);

        Student student3 = new Student("Luisa", "Evans");
        student3.setScholarship(300);

        Student student4 = new Student("Paul", "Butler");
        student4.setScholarship(150);

        Student student5 = new Student("Scott", "Tucker");
        student5.setScholarship(250);

        Student student6 = new Student("Francesca", "Sanders");
        student6.setScholarship(350);

        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        Student[] students1 = new Student[3];
        students1[0] = student4;
        students1[1] = student5;
        students1[2] = student6;

        Person[] people = new Person[12];
        people[0] = teacher1;
        people [1] = student1;
        people [2] = teacher2;
        people [3] = student2;


        Book book1 = new Book("English grammar");
        Book book2 = new Book("English literature");

        Book[] books = new Book[2];
        books[0] = book1;
        books[1] = book2;

        Library library = new Library(books);

        Department department1 = new Department("Department of Foreign Languages");
        department1.setTeachers(teachers);

        Department department2 = new Department("Department of Modern Translation Technologies");
        department2.setTeachers(teachers1);

        Department[] departments = new Department[2];
        departments[0] = department1;
        departments[1] = department2;

       // int sumOfSalaries1 = department1.calculateSalaries();

       // int sumOfSalaries2 = department2.calculateSalaries();

        Group group1 = new Group("group 1", students);
        Group group2 = new Group("group 2", students1);

        Group[] groups = new Group[2];
        groups[0] = group1;
        groups[1] = group2;

        //int sumOfScholarships1 = group1.calculateScholarships();
      //  int sumOfScholarships2 = group2.calculateScholarships();


        Faculty faculty = new Faculty("Faculty of Intercultural Communication", departments, groups);

       // Faculty faculty1 = new Faculty("Translation faculty", null);
       // faculty1.setGroups(null);

        Faculty[] faculties = new Faculty[1];
        faculties[0] = faculty;


        University university = new University("Minsk State Linguistic University");
        university.setFaculties(faculties);

        University[] universities = new University[1];
        universities[0] = university;

        int sumOfExpenses = university.calculateExpenses();
        System.out.println(sumOfExpenses);

        int tax =  Accounting.calculateTaxes(university);
        System.out.println("tax is" + " " + tax);



//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите зарплату сотрудника:");
//        float salary = scanner.nextFloat();
//        System.out.println("Введите сумму налога:");
//        int tax = scanner.nextInt();
//
//        float result = salary - tax;
//        System.out.println(result);

    }
}