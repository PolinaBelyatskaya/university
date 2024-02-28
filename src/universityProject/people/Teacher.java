package universityProject.people;

import universityProject.ITax;

import java.util.Objects;

public class Teacher extends Person implements ITax {

    private String degree;
    private int salaryPerMonth;
    private String salaryType;
    private static boolean isPremium;

    protected static int teacherCount = 0;
    protected static int premiumTeacherCount = 0;

    public Teacher(String firstName, String lastName, String degree) {
        super(firstName, lastName);
        this. degree = degree;
        teacherCount++;
    }


    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(int salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public String getSalaryType() {
        return salaryType;
    }

    public void setSalaryType(String salaryType) {
        this.salaryType = salaryType;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
        if (isPremium) {
            premiumTeacherCount++;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return salaryPerMonth == teacher.salaryPerMonth && Objects.equals(degree, teacher.degree) && Objects.equals(salaryType, teacher.salaryType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), degree, salaryPerMonth, salaryType);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "degree='" + degree + '\'' +
                ", salaryPerMonth=" + salaryPerMonth +
                ", salaryType='" + salaryType + '\'' +
                '}';
    }

    public static void premiumTeacherCount (){

        if (isPremium){
            premiumTeacherCount++;
        }
        else {
            premiumTeacherCount--;
        }
    }


    @Override
    public int calculateTax() {
        int tax;

        if(isPremium){
            tax = salaryPerMonth*20/100;
        }
        else{
            tax = salaryPerMonth*30/100;
        }

        return tax;
    }
}
