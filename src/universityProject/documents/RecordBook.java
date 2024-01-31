package universityProject.documents;

import java.util.Objects;

public class RecordBook extends Document {

    private String subject;
    private int mark;

    public RecordBook(String name){
        super(name);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RecordBook that = (RecordBook) o;
        return mark == that.mark && Objects.equals(subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subject, mark);
    }

    @Override
    public String toString() {
        return "RecordBook{" +
                "subject='" + subject + '\'' +
                ", mark=" + mark +
                '}';
    }
}
