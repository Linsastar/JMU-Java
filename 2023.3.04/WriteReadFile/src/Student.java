import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Student {
    public static class student{
        public String name;
        public String math;
        public String Java;
        public String DS;
        public String Average;
        public String Total;
        public student(String name,String math,String Java,String Ds,String Average,String Total) {
            this.Total=Total;
            this.math=math;
            this.name=name;
            this.Java=Java;
            this.DS=Ds;
            this.Average=Average;
        }
    }
//    public static void selectSort(student[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            int minIndex = i; // 用来记录最小值的索引位置，默认值为i
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j].Total < arr[minIndex].Total) {
//                    minIndex = j; // 遍历 i+1~length 的值，找到其中最小值的位置
//                }
//            }
//            // 交换当前索引 i 和最小值索引 minIndex 两处的值
//            if (i != minIndex) {
//                student temp = arr[i];
//                arr[i] = arr[minIndex];
//                arr[minIndex] = temp;
//            }
//            // 执行完一次循环，当前索引 i 处的值为最小值，直到循环结束即可完成排序
//        }
//    }
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out=new PrintWriter("src/name.txt");
        out.println("Name Math Java DS Average Total");
        String[] name=new String[20000];
        double[] math= new double[20000];
        double[] Java= new double[20000];
        double[] DS= new double[20000];
        double[] Average= new double[20000];
        double[] Total= new double[20000];
        for (int i=0;i<10000;i++){
            name[i]="张三xx";
            math[i]= (int)(0 + Math.random()*(100-0 + 1));
            Java[i]=(int)(0 + Math.random()*(100-0 + 1));
            DS[i]=(int)(0 + Math.random()*(100-0 + 1));
            int v = (int) (math[i] + Java[i] + DS[i]);
            Average[i]=(v)/3.0;
            Total[i]=v;
            out.println(name[i]+" "+math[i]+" "+Java[i]+" "+DS[i]+" "+(String.format("%.2f", Average[i])) +" "+Total[i]);
        }
        out.close();
//        Scanner in = new Scanner(new File("D:\\JavaProject\\WriteReadFile\\src\\name.txt"));
//        int number = 1;
//        student ar = new student("",0,0,0,0,0);
//        student[] arr=new student[10000];
//        while(in.hasNextLine()){
//            //判断扫描器是否还有下一行未读取，该循环把文件的每一行都读出
//            String line = in.nextLine();//读出file.txt的下一行
//            Scanner linescanner = new Scanner(line);//对每一行的内容建立一个扫描器
//            linescanner.useDelimiter(" ");//使用空格作为分隔符
//            ar.name=linescanner.next();
//            ar.math= Double.parseDouble(linescanner.next());
//            ar.Java=Double.parseDouble(linescanner.next());
//            ar.DS=Double.parseDouble(linescanner.next());
//            ar.Average = String.valueOf(Double.parseDouble(linescanner.next()));
//            ar.Total= String.valueOf(Double.parseDouble(linescanner.next()));
//            arr[number]=ar;
//            number++;
//        }
//        in.close();
//        selectSort(arr);
//        for(int i=0;i<10;i++){
//            System.out.println(arr[i].name+" "+arr[i].math+" "+arr[i].Java+" "+arr[i].DS+" "+arr[i].Average+" "+arr[i].Total);
//        }
    }
}
