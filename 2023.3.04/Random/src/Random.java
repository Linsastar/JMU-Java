import java.text.NumberFormat;
import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[]arr=new int[n];
        int Top=0;
        int Down=0;
        for(int i=0;i<n;i++){
            int i1 = (int) (1000 + Math.random() * (2000 - 1000 + 1));
            arr[i]=i1;
        }
        for(int j=0;j<n;j++){
            if(arr[j]<=1500) {
                Down++;
            }
            else {
                Top++;
            }
        }
        double downpercent=Down/(n*1.0);
        double toppercent=Top/(n*1.0);
        NumberFormat num = NumberFormat.getPercentInstance();
        String rates1 = num.format(downpercent);
        System.out.println("大于1500所占的百分比为："+rates1);
        String rates2 = num.format(toppercent);
        System.out.println("小于等于于1500所占的百分比为："+rates2);
    }
}
