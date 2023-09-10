import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        QuadraticEquation Equation = new QuadraticEquation();
        System.out.println("请输入a的值：");
        int a=in.nextInt();
        Equation.setA(a);
        System.out.println("请输入b的值：");
        int b=in.nextInt();
        Equation.setB(b);
        System.out.println("请输入c的值：");
        int c=in.nextInt();
        Equation.setC(c);
        System.out.println("判别式的值为：");
        System.out.println(Equation.getDiscriminant());
        if(Equation.getDiscriminant()>0){
            System.out.println("根1的值为：");
            System.out.println(Equation.getRoot1());
            System.out.println("根2的值为：");
            System.out.println(Equation.getRoot2());
        }
        else if (Equation.getDiscriminant()==0) {
            System.out.println("根的值为：");
            System.out.println(Equation.getRoot1());
        }
        else if (Equation.getDiscriminant()<0) {
            System.out.println("The equation has no roots.");
        }
    }
}
