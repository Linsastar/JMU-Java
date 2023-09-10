import java.text.NumberFormat;
import java.util.Scanner;

public class RandChar {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入你要生成的随机字符数量");
        int n=in.nextInt();
        char[] arr=new char[n];
        for(int i=0;i<n;i++) {
            arr[i]=(char)('a' + Math.random() * ('z' - 'a' + 1));
        }
        System.out.println("随机生成的字符为：");
        for(int j=0;j<n;j++){
            System.out.print(arr[j]);
        }
        System.out.println();
        double[] percent=new double[26];
        for(int k=0;k<n;k++) {
            int temp='z'-arr[k];
            percent[temp]++;
        }
        for(int l=0;l<26;l++){
            percent[l]/=n;
        }
        NumberFormat num = NumberFormat.getPercentInstance();
        for(int i2=0;i2<26;i2++){
            String rates = num.format(percent[i2]);
            System.out.println("字符"+(char)('a'+i2)+"所占的百分比为："+rates);
        }
    }
}
