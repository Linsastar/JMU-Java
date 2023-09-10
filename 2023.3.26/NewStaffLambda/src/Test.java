import human.Dean;
import human.SecurityGuard;
import human.Staff;
import human.Teacher;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Test {
    private static void printName(Staff[] staffs) {
        for (Staff i : staffs) {
            System.out.println(i.getName());
        }
    }

    private static void printSalary(Staff[] staffs){
        for (Staff i : staffs) {
            System.out.println(i.getName() + "薪水为：" + i.getTotalSalary());
        }
    }
    private static void printAge(Staff[] staffs) {
        for (Staff i : staffs) {
            System.out.println(i.getName() + "年龄为：" + i.getAge());
        }
    }

    private static void sortBySalary(Staff[] staffs){
        Arrays.stream(staffs)
                .sorted((s1, s2) ->Double.compare(s1.getTotalSalary(), s2.getTotalSalary())).forEach(s ->
                        System.out.println(s.getName() + ", 薪资为: " + s.getTotalSalary()));
    }
    private static void sortByAge(Staff[] staffs){
        Arrays.stream(staffs)
                .sorted((s1, s2) ->Double.compare(s1.getAge(), s2.getAge())).forEach(s ->
                        System.out.println(s.getName() + ", 年龄为: " + s.getAge()));
        Arrays.stream(staffs).sorted()
    }
    private static void sortByName(Staff[] staffs){
        Arrays.sort(staffs,new Staff.NameComparator());
    }
    private static void sortByDateHired(Staff[] staffs){
        Arrays.sort(staffs,new Staff.DateHiredComparator());
    }
    public static void main(String[] args) {
        Staff[] staffs = new Staff[4];
        staffs[0] = new Teacher("集美大学范乔智", "福建省福州市", 35, "男", 5000, new Date(2020,1,1), "计算机科学与技术", "软件工程", 1000);
        staffs[1] = new SecurityGuard("吴才湘", "湖南省怀化市", 28, "男", 3000, new Date(1111,1,1), "防火", 3455);
        staffs[2] = new Dean("张振宇", "江苏省苏州市", 45, "男", 8000, new Date(2222,1,1), "计算机科学与技术", "网络工程", 2000, 3000);
        staffs[3] = new Teacher("吴润", "福建省莆田市", 40, "男", 6000, new Date(5555,1,1), "计算机科学与技术", "智能科学与技术", 10001);
        sortBySalary(staffs);
        sortByAge(staffs);
    }
}
