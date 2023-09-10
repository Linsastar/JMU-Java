import java.util.Scanner;

public class Iteration {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入你所需要迭代的次数：");
        int n=0;
        n=in.nextInt();
        double e=E(n);
        System.out.println("经过迭代后我们得出e的近似值为:");
        System.out.println(e);
    }
    private static double E(int n)//n为迭代次数
    {
        double x=1,t=1;
        for(int i = 1; i <= n; i++) {
            t *= i;
            x += 1 / t;
        }
        return x;
    }
}
