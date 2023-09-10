import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        int a,b;
        Scanner in =new Scanner(System.in);
        System.out.println("请输入数A：");
        a=in.nextInt();
        System.out.println("请输入数B：");
        b=in.nextInt();
        int k= gcd_recursive(a,b);
        System.out.println("最大公约数为：");
        System.out.println(k);
    }
    private static int gcd_recursive(int m, int n) //递归
    {
        int r=m%n;
        if(r==0) {
            return n;
        }
        return gcd_recursive(n,r);
    }
}
