import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String ars[]) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int n=Integer.parseInt(s);
        String[] numbers=new String[n];
        String[] birth=new String[n];
        for(int i=0;i<n;i++) {
            numbers[i]=in.nextLine();
            birth[i]=numbers[i].substring(6,10)+"-"+numbers[i].substring(10,12)+"-"+numbers[i].substring(12,14);
        }
        sort1(birth);
    }
    private static void sort1(String[] birth) {
        Arrays.sort(birth);
        for(int i=0;i<birth.length;i++) {
            System.out.println(birth[i]);
        }
    }
}
