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

    private static void printSalary(Staff[] staffs) {
        for (Staff i : staffs) {
            System.out.println(i.getName() + "薪水为：" + i.getTotalSalary());
        }
    }

    private static void printAge(Staff[] staffs) {
        for (Staff i : staffs) {
            System.out.println(i.getName() + "年龄为：" + i.getAge());
        }
    }

    private static void sortBySalary(Staff[] staffs) {
        Arrays.sort(staffs, new Staff.SalaryComparator());
    }

    private static void sortByAge(Staff[] staffs) {
        Arrays.sort(staffs, new Staff.AgeComparator());
    }

    private static void sortByName(Staff[] staffs) {
        Arrays.sort(staffs, new Staff.NameComparator());
    }

    private static void sortByDateHired(Staff[] staffs) {
        Arrays.sort(staffs, new Staff.DateHiredComparator());
    }

    public static void main(String[] args) {
        Staff[] staffs = new Staff[4];
        staffs[0] = new Teacher("集美大学范乔智", "福建省福州市", 35, "男", 5000, new Date(2020, 1, 1), "计算机科学与技术", "软件工程", 1000);
        staffs[1] = new SecurityGuard("吴才湘", "湖南省怀化市", 28, "男", 3000, new Date(1111, 1, 1), "防火", 500);
        staffs[2] = new Dean("张振宇", "江苏省苏州市", 45, "男", 8000, new Date(2222, 1, 1), "计算机科学与技术", "网络工程", 2000, 3000);
        staffs[3] = new Teacher("吴润", "福建省莆田市", 40, "男", 6000, new Date(5555, 1, 1), "计算机科学与技术", "智能科学与技术", 1500);
        Arrays.sort(staffs, new Staff.AgeComparator());
        printSalary(staffs);
        Arrays.sort(staffs, new Staff.NameComparator());
        printName(staffs);
        sortBySalary(staffs);
        printSalary(staffs);
        sortByAge(staffs);
        printAge(staffs);
        sortByName(staffs);
        printName(staffs);
        sortByDateHired(staffs);
        printName(staffs);
    }
}
/*编写一个测试类，在测试类中添加若干个Staff, Teacher, SecurityGuard, Dean实例(个数及内容自定)，并在测试类中定义并测试如下方法：
①编写一个方法private static void printName(Staff[] staffs)打印出每个人的名字；
②编写一个方法private static void printSalary(Staff[] staffs)打印出Staff类或者其子类对象的薪水
(注意：Staff的薪水只有salary，Teacher的薪水为salary+postAllowance，SecurityGuard的薪水为salary+
        dangerousAllowance，而Dean的薪水则为salary+postAllowance+adminAward)；
③编写一方法private static void sortBySalary(Staff[] staffs)，支持对Staff类及其子类按照各自的薪水降序排序；
④编写一方法private static void sortByAge(Staff[] staffs)，对Staff对象按照年龄升序排序，再编写一个方法按name升序进行排序；
⑤编写一方法sortByDateHired，支持对Staff类及其子类按照各自的dateHired升序排序，可以使用java.util.Date类的getTime方法。*/
