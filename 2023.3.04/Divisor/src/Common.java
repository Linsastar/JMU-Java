import java.util.Scanner;

public class Common {
    public static void main(String[] args) {
        int a,b;
        Scanner in =new Scanner(System.in);
        System.out.println("请输入数A：");
        a=in.nextInt();
        System.out.println("请输入数B：");
        b=in.nextInt();
        int c=0;
        if(a<b)
        {
            c=a;
            a=b;
            b=c;
        }
        int k= gcd(a,b);
        System.out.println("最大公约数为：");
        System.out.println(k);
    }
    private static int gcd(int m, int n)//非递归
    {
        int r=m%n;
        while (r!=0)
        {
            m=n;
            n=r;
            r=m%n;
        }
        return n;
    }
}
