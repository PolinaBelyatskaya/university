package university.items;

import university.Address;
import university.items.Faculty;
import university.items.Library;

public class University {

    private String name;
    private Faculty[] faculties;
    private Address address;
    private Library library;

    public University(String name){
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

    public int calculateExpenses(){

        int result = 0;

        for (Faculty f : faculties) {
            result = result + f.calculateExpenses();
        }
        return result;
    }
}
