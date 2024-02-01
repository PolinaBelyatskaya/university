package universityProject.items;

import university.Address;

import java.util.Arrays;
import java.util.Objects;

public class University extends UniversityUnit {

    private String name;
    private Faculty[] faculties;
    private Address address;
    private Library library;

    public University(String name) {
        super(name);
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


    @Override
    public int calculateExpenses() {

        int result = 0;

        for (Faculty f : faculties) {
            result = result + f.calculateExpenses();
        }
        return result;
    }

    public int calculateExpenses(boolean isPremium) {

        int expenses = 0;

        for (Faculty f : faculties) {
            expenses = expenses + f.calculateExpenses(isPremium);
        }
        return expenses;
    }
}

