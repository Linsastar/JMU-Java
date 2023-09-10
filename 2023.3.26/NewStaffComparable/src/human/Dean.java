package human;

import java.util.Date;
public class Dean extends Teacher {
    private double adminAward;
    public Dean(String name, String address, int age, String sex, double salary, Date dateHired, String department, String speciality, double postAllowance, double adminAward) {
        super(name, address, age, sex, salary, dateHired, department, speciality, postAllowance);
        this.adminAward = adminAward;
    }
    public double getAdminAward() {
        return adminAward;
    }
    public double getTotalSalary() {
        return getSalary()+getPostAllowance()+getAdminAward();
    }
    public void setAdminAward(double adminAward) {
        this.adminAward = adminAward;
    }
}