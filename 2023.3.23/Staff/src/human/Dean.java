package human;

import java.util.Date;

public class Dean extends Teacher{
    double adminAward;
    public Dean(String name, String address, boolean sex, double salary, Date dateHired, int age,String department, double postAllowance, double adminAward) {
        super(name, address, sex, salary, dateHired,age,department, postAllowance);
        this.adminAward = adminAward;
    }
//(4)编写Teacher的一个子类Dean(院长)，包含属性：adminAward(行政奖金)。
    public double getAdminAward() {
        return adminAward;
    }

    public void setAdminAward(double adminAward) {
        this.adminAward = adminAward;
    }
    public double getTotalsalary() {
        double sum;
        sum=getSalary()+getAdminAward()+getPostAllowance();
        this.setTotalsalary(sum);
        return sum;
    }
}
