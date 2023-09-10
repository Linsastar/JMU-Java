package human;

import java.util.Comparator;
import java.util.Date;

public class Staff {
    private String name;
    private String address;
    private int age;
    private String sex;
    private double salary;
    private Date dateHired;
    public Staff(String name, String address, int age, String sex, double salary, Date dateHired) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.dateHired = dateHired;
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public double getSalary() {
        return salary;
    }
    public double getTotalSalary() {
        return getSalary();
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
    public static class AgeComparator implements Comparator<Staff> {
        @Override
        public int compare(Staff s1, Staff s2) {
            return Integer.compare(s1.getAge(), s2.getAge());
        }
    }
    public static class NameComparator implements Comparator<Staff> {
        @Override
        public int compare(Staff s1, Staff s2) {
            if(s1.getName().length()>s2.getName().length()){
                return 1;
            }
            else {
                return -1;
            }
        }
    }
    public static class ComplexComparator implements Comparator<Staff> {
        private Comparator<Staff> primaryComparator;
        private Comparator<Staff> secondaryComparator;

        public ComplexComparator(Comparator<Staff> primaryComparator, Comparator<Staff> secondaryComparator) {
            this.primaryComparator = primaryComparator;
            this.secondaryComparator = secondaryComparator;
        }

        @Override
        public int compare(Staff s1, Staff s2) {
            int result = primaryComparator.compare(s1, s2);
            if (result == 0) {
                result = secondaryComparator.compare(s1, s2);
            }
            return result;
        }
    }
    public static class SalaryComparator implements Comparator<Staff> {
        @Override
        public int compare(Staff s1, Staff s2) {
            return -Double.compare(s1.getTotalSalary(), s2.getTotalSalary());
        }
    }
    public static class DateHiredComparator implements Comparator<Staff> {
        @Override
        public int compare(Staff s1, Staff s2) {
            return s1.getDateHired().compareTo(s2.getDateHired());
        }
    }
}