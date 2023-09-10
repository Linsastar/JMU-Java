import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static Student makeStudentFromString(String[] students) {
        Student a = new Student(students[0], students[1], students[2], students[3], students[4], students[5]);
        return a;
    }

    public static void main(String[] args) throws IOException {
//        Scanner in=new Scanner("src/Student.txt");
        File file = new File("src/Student.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        int i = 0;
        Student[] array = new Student[100];
        int count=1;
        while ((line = br.readLine()) != null) {
            String[] read = new String[6];
            Scanner linescanner = new Scanner(line);//对每一行的内容建立一个扫描器
            linescanner.useDelimiter(" ");//使用空格作为分隔符
            String name = linescanner.next();
            read[0] = name;
            String math = linescanner.next();
            read[1] = math;
            String java = linescanner.next();
            read[2] = java;
            String ds = linescanner.next();
            read[3] = ds;
            String total = linescanner.next();
            read[4] = total;
            String avg = linescanner.next();
            read[5] = avg;
            /*System.out.println("name="+name+" math="+math+" java="+java+" ds="+ds+" total="+total+" avg="+avg);*/
            array[count-1] = makeStudentFromString(read);
            count++;
        }
        br.close();
        Bsort(array,count);
        for (int k = 0; k < 3; k++) {
            System.out.println(array[k]);
        }
    }

    public static void Bsort(Student[] array,int count) {
        for(int i=0;i<count;i++){
            for (int j=0;j<count-2-i;j++){
                double num1=Integer.parseInt(array[j].getTotal());
                double num2=Integer.parseInt(array[j+1].getTotal());
                if(num2>num1)
                {
                    Student temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
}
