package universityProject.items;

import java.util.Objects;

public abstract class UniversityUnit {

    private String name;

    public UniversityUnit(String name) {
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
}
