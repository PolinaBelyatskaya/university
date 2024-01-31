package universityProject.documents;

import java.time.LocalDate;
import java.util.Objects;

public class StudentID extends Document{

    private int id;
    private LocalDate startDate;
    private LocalDate expirationDate;

    public StudentID(String name, int id, LocalDate startDate, LocalDate expirationDate) {
        super(name);
        this.id = id;
        this.startDate = startDate;
        this.expirationDate = expirationDate;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        StudentID studentID = (StudentID) o;
        return id == studentID.id && Objects.equals(startDate, studentID.startDate) && Objects.equals(expirationDate, studentID.expirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, startDate, expirationDate);
    }

    @Override
    public String toString() {
        return "StudentID{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
