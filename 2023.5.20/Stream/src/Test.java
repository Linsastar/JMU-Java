import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author gong
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 生成测试数据
        List<Student> stus = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student s = new Student(i + 1, "Student" , 18, 60 + i % 40);
            stus.add(s);
        }




        // 使用 DataInputStream/DataOutputStream 写入文件
        long start1 = System.currentTimeMillis();
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data1.txt"))) {
            Student.writeStudent(stus, dos);
        }
        try (DataInputStream dis =new DataInputStream(new FileInputStream("data1.txt"))){
            System.out.println(Student.readStudent(dis));
        }
        long end1 = System.currentTimeMillis();
        System.out.println("DataInputStream/DataOutputStream 耗时：" + (end1 - start1) + "ms");



        //Scanner(或BufferedReader), PrintWriter
        long start2 = System.currentTimeMillis();
        try (PrintWriter pw = new PrintWriter(new FileWriter("data2.txt"))) {
            Student.writeStudent(stus, pw);
        }
        Scanner scanner =new Scanner(new File("data2.txt"));
        try {
            for (Scanner it = scanner; it.hasNext(); )
            {
                System.out.println(it.next());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Scanner/PrintWriter 耗时：" + (end2 - start2) + "ms");






        //ObjectInputStream, ObjectOutputStream
        long start3=System.currentTimeMillis();
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("data3.txt"));

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("data3.txt"));

        try(oos){
            Student.writeStudent(stus,oos);
        }catch (Exception e){
            e.printStackTrace();
        }

        try (ois){
            System.out.println(Student.readStudent(ois));
        }
        long end3=System.currentTimeMillis();
        System.out.println("ObjectInputStream/ObjectOutputStream 耗时："+ (end3 - start3) + "ms");
    }
}
