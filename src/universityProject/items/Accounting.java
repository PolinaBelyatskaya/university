package universityProject.items;

import universityProject.items.Department;
import universityProject.items.Faculty;
import universityProject.items.Group;
import universityProject.people.Person;

public final class Accounting {

    public static int calculateTaxes(Person[] people) {

        int peopleTaxes = 0;

        for (Person p : people) {
            peopleTaxes = peopleTaxes + p.calculateTax();

        }
        return peopleTaxes;
    }
}

