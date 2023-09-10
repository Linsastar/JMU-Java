import java.util.Scanner;

public class Judge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个三位数:");
        int i = sc.nextInt();
        NarcissisticNumber a=new NarcissisticNumber();
        a.isNarcissisticNumber(i);
    }
}