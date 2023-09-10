import human.Dean;
import human.SecurityGuard;
import human.Staff;
import human.Teacher;

import java.util.Date;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        Staff[] a=new Staff[3];
        Teacher[] b=new Teacher[3];
        SecurityGuard[] c=new SecurityGuard[3];
        Dean[] d=new Dean[3];
        for (int i1 = 0; i1 < 3; i1++) {
            a[i1]=new Staff("范乔智" + i1 + "号","银江路" + i1 + "号",
                    true,1000 + 100 * i1,new Date(2000, 1, 1, 12, i1),18-i1);
        }
        for (int i1 = 0; i1 < 3; i1++) {
            b[i1]=new Teacher("王厚润" + i1 + "号","集源路" + i1 + "号",
                    true,1000 + 100 * i1,new Date(2000, 1, 1, 12, i1),19-i1,"集美大专" + i1 + "号学院",1000 * i1);
        }
        for(int i=0;i<3;i++){
            c[i]=new SecurityGuard("吴才湘" + i + "号","石鼓路" + i + "号",
                    true,1000 + 100 * i,new Date(2000, 1, 1, 12, i),25+i,"玩瓦洛兰特",100);
        }
        for(int i=0;i<3;i++){
            d[i]=new Dean("张振宇" + i + "号","集源路" + i + "号",
                    true,1000 + 100 * i,new Date(2000, 1, 1, 12, i),20-i,"集美大专" + i + "号学院",1000 * i,1000000);
        }
        printName(a);
        printSalary(b);
        sortBySalary(d);
        sortByAge(d);
        sortByName(c);
    }
    public static void printName(Staff[] persons){/*①编写一个方法private static void printName(Staff[] persons)打印出每个人的名字；*/
        for(int i=0;i< persons.length;i++){
            System.out.println(persons[i].getName());
        }
    }
    public static void printSalary(Staff[] staffs){
        for(int i=0;i< staffs.length;i++){
            System.out.println(staffs[i].getTotalsalary());
        }
    }
    public static void sortBySalary(Staff[] staffs){
        Quicksort(staffs,0, staffs.length-1);
        for (Staff staff : staffs) {
            System.out.println(staff.getName() + "的薪资为：" + staff.getTotalsalary());
        }
    }
    public static void Quicksort(Staff[] staffs, int low, int high) {
        int i,j;
        if (low>high) {
            return;
        }
        i=low;
        j=high;
        Staff temp=staffs[low];//基准位,low=length时，会报异常，java.lang.ArrayIndexOutOfBoundsException: 4 ，所以必须在if判断后面,就跳出方法。
        while(staffs[i].getTotalsalary()<staffs[j].getTotalsalary()){
            //先从右边开始往左递减，找到比temp小的值才停止
            while (temp.getTotalsalary()<=staffs[j].getTotalsalary() && i<j) {
                j--;
            }
            //再看左边开始往右递增，找到比temp大的值才停止
            while ( temp.getTotalsalary()>=staffs[i].getTotalsalary() && i<j) {
                i++;
            }
            //满足 i<j 就交换,继续循环while(i<j)
            if (i<j) {
                Staff t=staffs[i];
                staffs[i]=staffs[j];
                staffs[j]=t;
            }
        }
        //最后将基准位跟  a[i]与a[j]相等的位置，进行交换,此时i=j
        staffs[low]=staffs[i];
        staffs[i]=temp;
        //左递归
        Quicksort(staffs, low, j-1);
        //右递归
        Quicksort(staffs, j+1, high);
    }
    public static void sortByAge(Staff[] staffs){
        AgeQuicksort(staffs,0, staffs.length-1);
        for (Staff staff : staffs) {
            System.out.println(staff.getName() + "的年龄为：" + staff.getAge());
        }
    }
    public static void AgeQuicksort(Staff[] staffs, int low, int high) {
        int i,j;
        if (low>high) {
            return;
        }
        i=low;
        j=high;
        Staff temp=staffs[low];//基准位,low=length时，会报异常，java.lang.ArrayIndexOutOfBoundsException: 4 ，所以必须在if判断后面,就跳出方法。
        while(staffs[i].getAge()<staffs[j].getAge()){
            //先从右边开始往左递减，找到比temp小的值才停止
            while (temp.getAge()<=staffs[j].getAge() && i<j) {
                j--;
            }
            //再看左边开始往右递增，找到比temp大的值才停止
            while ( temp.getAge()>=staffs[i].getAge() && i<j) {
                i++;
            }
            //满足 i<j 就交换,继续循环while(i<j)
            if (i<j) {
                Staff t=staffs[i];
                staffs[i]=staffs[j];
                staffs[j]=t;
            }
        }
        //最后将基准位跟  a[i]与a[j]相等的位置，进行交换,此时i=j
        staffs[low]=staffs[i];
        staffs[i]=temp;
        //左递归
        AgeQuicksort(staffs, low, j-1);
        //右递归
        AgeQuicksort(staffs, j+1, high);
    }
    public static void NameQuicksort(Staff[] staffs, int low, int high){
        int i,j;
        if (low>high) {
            return;
        }
        i=low;
        j=high;
        Staff temp=staffs[low];//基准位,low=length时，会报异常，java.lang.ArrayIndexOutOfBoundsException: 4 ，所以必须在if判断后面,就跳出方法。
        while(staffs[i].getName().length()<staffs[j].getName().length()){
            //先从右边开始往左递减，找到比temp小的值才停止
            while (temp.getName().length()<=staffs[j].getName().length() && i<j) {
                j--;
            }
            //再看左边开始往右递增，找到比temp大的值才停止
            while ( temp.getName().length()>=staffs[i].getName().length() && i<j) {
                i++;
            }
            //满足 i<j 就交换,继续循环while(i<j)
            if (i<j) {
                Staff t=staffs[i];
                staffs[i]=staffs[j];
                staffs[j]=t;
            }
        }
        //最后将基准位跟  a[i]与a[j]相等的位置，进行交换,此时i=j
        staffs[low]=staffs[i];
        staffs[i]=temp;
        //左递归
        AgeQuicksort(staffs, low, j-1);
        //右递归
        AgeQuicksort(staffs, j+1, high);
    }
    public static void sortByName(Staff[] staffs){
        NameQuicksort(staffs,0, staffs.length-1);
        for (Staff staff : staffs) {
            System.out.println(staff.getName());
        }
    }
}
/*(6)编写一个测试类，在测试类中添加若干个Staff, Teacher, SecurityGuard, Dean实例(个数及内容自定)，并在测试类中定义并测试如下方法：①编写一个方
法private static void printName(Staff[] persons)打印出每个人的名字；②编写一个方法private static void printSalary(Staff[] staffs)
打印出Staff类或者其子类对象的薪水(注意：Staff的薪水只有salary，
Teacher的薪水为salary+postAllowance，SecurityGuard的薪水为salary+dangerousAllowance，
而Dean的薪水则为salary+postAllowance+adminAward)；③编写一方法private static void sortBySalary(Staff[] staffs)，
支持对Staff类及其子类按照各自的薪水降序排序；④编写一方法private static void sortByAge(Staff[] staffs)，对Staff对象按照年龄升序排序，
再编写一个方法按name升序进行排序；⑤(选做)编写一方法sortByDateHired，
支持对Staff类及其子类按照各自的dateHired升序排序，可以使用java.util.Date类的getTime方法。
说明：排序暂时不要使用比较器（Comparable、Comparator等）！*/
