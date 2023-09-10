import human.Dean;
import human.SecurityGuard;
import human.Staff;
import human.Teacher;

import java.util.Date;
public class Test {
    public static void main(String[] args) {
        Staff[] staffs = new Staff[4];
        staffs[0] = new Teacher("范乔智", "福建省福州市", 35, "男", 5000, new Date(), "计算机科学与技术", "软件工程", 1000);
        staffs[1] = new SecurityGuard("吴才湘", "湖南省怀化市", 28, "男", 3000, new Date(), "防火", 500);
        staffs[2] = new Dean("张振宇", "江苏省苏州市", 45, "男", 8000, new Date(), "计算机科学与技术", "网络工程", 2000, 3000);
        staffs[3] = new Teacher("陈建兴", "福建省莆田市", 40, "女", 6000, new Date(), "计算机科学与技术", "智能科学与技术", 1500);
        printName(staffs);
        printSalary(staffs);
        sortBySalary(staffs);
        sortByAge(staffs);
    }
    private static void printName(Staff[] persons) {
        for (Staff person : persons) {
            System.out.println(person.getName());
        }
    }
    private static void printSalary(Staff[] staffs) {
        for (Staff staff : staffs) {
            if (staff instanceof Teacher) {
                Teacher teacher = (Teacher) staff;
                System.out.println(teacher.getName() + "的薪水为：" + (teacher.getSalary() + teacher.getPostAllowance()));
            } else if (staff instanceof SecurityGuard) {
                SecurityGuard securityGuard = (SecurityGuard) staff;
                System.out.println(securityGuard.getName() + "的薪水为：" + (securityGuard.getSalary() + securityGuard.getDangerousAllowance()));
            } else if (staff instanceof Dean) {
                Dean dean = (Dean) staff;
                System.out.println(dean.getName() + "的薪水为：" + (dean.getSalary() + dean.getPostAllowance() + dean.getAdminAward()));
            } else {
                System.out.println(staff.getName() + "的薪水为：" + staff.getSalary());
            }
        }
    }
    private static void sortBySalary(Staff[] staffs) {
        for (int i = 0; i < staffs.length; i++) {
            for (int j = i + 1; j < staffs.length; j++) {
                double salary1 = getSalary(staffs[i]);
                double salary2 = getSalary(staffs[j]);
                if (salary1 < salary2) {
                    Staff temp = staffs[i];
                    staffs[i] = staffs[j];
                    staffs[j] = temp;
                }
            }
        }
        System.out.println("按照薪水排序后：");
        printSalary(staffs);
    }
    private static double getSalary(Staff staff) {
        if (staff instanceof Teacher) {
            Teacher teacher = (Teacher) staff;
            return teacher.getSalary() + teacher.getPostAllowance();
        } else if (staff instanceof SecurityGuard) {
            SecurityGuard securityGuard = (SecurityGuard) staff;
            return securityGuard.getSalary() + securityGuard.getDangerousAllowance();
        } else if (staff instanceof Dean) {
            Dean dean = (Dean) staff;
            return dean.getSalary() + dean.getPostAllowance() + dean.getAdminAward();
        } else {
            return staff.getSalary();
        }
    }
    private static void sortByAge(Staff[] staffs) {
        for (int i = 0; i < staffs.length; i++) {
            for (int j = i + 1; j < staffs.length; j++) {
                if (staffs[i].getAge() > staffs[j].getAge()) {
                    Staff temp = staffs[i];
                    staffs[i] = staffs[j];
                    staffs[j] = temp;
                }
            }
        }
        System.out.println("按照年龄升序排序后：");
        printName(staffs);
        sortBySalary(staffs);
    }
}