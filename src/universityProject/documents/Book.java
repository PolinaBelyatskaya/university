package universityProject.documents;

import java.util.Objects;

public class Book extends Document{

    private int issueYear;

    public Book(String name){
        super(name);
    }

    public int getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(int issueYear) {
        this.issueYear = issueYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return issueYear == book.issueYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(issueYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "issueYear=" + issueYear +
                '}';
    }
}
