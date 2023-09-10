package human;

import java.util.Date;

//编写SecurityGuard类(保安)，继承自Staff类，包含属性：skills(专技), dangerousAllowance(高危津贴)。
public class SecurityGuard extends Staff {
    String skills;
    double dangerousAllowance;
    public String getSkills() {
        return skills;
    }
    public void setSkills(String skills) {
        this.skills = skills;
    }
    public double getDangerousAllowance() {
        return dangerousAllowance;
    }
    public void setDangerousAllowance(double dangerousAllowance) {
        this.dangerousAllowance = dangerousAllowance;
    }
    public SecurityGuard(String name, String address, boolean sex, double salary, Date dateHired,int age, String skills, double dangerousAllowance) {
        super(name, address, sex, salary, dateHired,age);
        this.skills = skills;
        this.dangerousAllowance = dangerousAllowance;
    }
    public double getTotalsalary() {
        double sum;
        sum=getSalary()+getDangerousAllowance();
        this.setTotalsalary(sum);
        return sum;
    }
}
