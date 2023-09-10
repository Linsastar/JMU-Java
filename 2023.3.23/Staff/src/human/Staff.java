package human;

import java.util.Date;

public class Staff {
    //(name, address, age, sex, salary, dateHired)，类型自定，其中salary为工资，dateHired为雇佣日期(java.util.Date类型)。生成相应的setter/getter方法
    private String name;
    private String address;
    private boolean sex;
    private double salary;
    private Date dateHired;
    private double totalsalary;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Staff(String name, String address, boolean sex, double salary, Date dateHired,int age) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.salary = salary;
        this.dateHired = dateHired;
        this.totalsalary=this.salary;
        this.age=age;
    }
    public double getTotalsalary() {
        return totalsalary;
    }

    protected void setTotalsalary(double totalsalary) {
        this.totalsalary = totalsalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }
}
