import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        double[] x = new double[3];
        double sum = 0.0;
        Scanner inputScan = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            System.out.println("Please input the " + (i + 1) + " number:");
            while (true) {//循环直到输入合法的数字
                String input = inputScan.nextLine();
                try {
                    x[i] = Double.parseDouble(input);//尝试将输入转换为double类型
                    break;//如果转换成功，则跳出循环
                } catch (NumberFormatException e) {//如果输入的不是数字字符串
                    System.out.println("Invalid input, please input again.");
                }
            }
            sum += x[i];
        }
        System.out.println(Arrays.toString(x));
        System.out.println("Sum:" + sum);
    }
}
