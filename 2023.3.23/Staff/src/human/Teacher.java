package human;

import java.util.Date;

//编写Teacher类(教师)，继承自Staff类，包含属性：department(系), speciality(专业), postAllowance(岗位津贴)
public class Teacher extends Staff{
    private String department;
    private double postAllowance;

    public Teacher(String name, String address, boolean sex, double salary, Date dateHired,int age, String department, double postAllowance) {
        super(name, address, sex, salary, dateHired,age);
        this.department = department;
        this.postAllowance = postAllowance;
    }
    public double getTotalsalary() {
        double sum;
        sum=getSalary()+getPostAllowance();
        this.setTotalsalary(sum);
        return sum;
    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPostAllowance() {
        return postAllowance;
    }

    public void setPostAllowance(double postAllowance) {
        this.postAllowance = postAllowance;
    }
}
