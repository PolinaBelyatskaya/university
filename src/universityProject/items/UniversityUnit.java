package universityProject.items;

import universityProject.ITax;
import universityProject.people.Person;

import java.util.Objects;

public abstract class UniversityUnit implements ITax {

    private String name;

    public UniversityUnit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniversityUnit that = (UniversityUnit) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "UniversityUnit{" +
                "name='" + name + '\'' +
                '}';
    }

//    public abstract int calculateExpenses();
//
//    public abstract int calculateExpenses(boolean isPremium);

//    public abstract int calculateTax();

    public abstract Person[] getPersons();

    }
