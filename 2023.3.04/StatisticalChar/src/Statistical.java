import java.io.File;
import java.io.FileNotFoundException;
//import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.Scanner;

public class Statistical {
    public static void main(String[] args)throws FileNotFoundException {
        //PrintWriter out = new PrintWriter("String.txt");这个是输出，注释一下备用
        Scanner in=new Scanner(new File("src/String.txt")); //为String.txt这个File创建一个扫描器in
        double[] arr=new double[26];//这个用来统计每个字母出现的次数
        while (in.hasNextLine()){
            String ch= in.nextLine();
            char[] array=ch.toCharArray();
            for (char i:array) {
                if(i>='a'&&i<='z'){
                    i-=32;
                    int temp=i-'A';
                    arr[temp]++;
                }
                else if(i>='A'&&i<='Z'){
                    int temp=i-'A';
                    arr[temp]++;
                }
            }
        }
        int total=0;
        for(int l=0;l<26;l++){
            total+=arr[l];
        }
        double[] percent=new double[26];//统计我们每个字母的概率
        for(int l=0;l<26;l++){
            percent[l]+=(arr[l] / total);
        }
        NumberFormat num = NumberFormat.getPercentInstance();
        for(int i2=0;i2<26;i2++){
            String rates = num.format(percent[i2]);
            System.out.println("字符"+(char)('a'+i2)+"所占的百分比为："+rates);
        }
    }
}
