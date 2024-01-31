package universityProject.documents;

import java.util.Objects;

public class Timetable extends Document{

    private float startTime;
    private float endTime;
    private String classRoom;

    public Timetable(String name) {
        super(name);
    }

    public float getStartTime() {
        return startTime;
    }

    public void setStartTime(float startTime) {
        this.startTime = startTime;
    }

    public float getEndTime() {
        return endTime;
    }

    public void setEndTime(float endTime) {
        this.endTime = endTime;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Timetable timetable = (Timetable) o;
        return Float.compare(startTime, timetable.startTime) == 0 && Float.compare(endTime, timetable.endTime) == 0 && Objects.equals(classRoom, timetable.classRoom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), startTime, endTime, classRoom);
    }

    @Override
    public String toString() {
        return "Timetable{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", classRoom='" + classRoom + '\'' +
                '}';
    }
}
