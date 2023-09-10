import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gong
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private double grade;

    public Student(int id, String name, int age, double grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public static void writeStudent(List<Student> stus, ObjectOutputStream oos) throws IOException {
        for (Student i : stus) {
            oos.writeInt(i.getId());
            oos.writeUTF(i.getName());
            oos.writeInt(i.getAge());
            oos.writeDouble(i.getGrade());

        }
    }

    public static List<Student> readStudent(ObjectInputStream ois) throws IOException {
        List<Student> students = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            int id = ois.readInt();
            String name = ois.readUTF();
            int age = ois.readInt();
            double grade = ois.readDouble();
            students.add(new Student(id, name, age, grade));
        }
        return students;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}'+'\n';
    }
    public static void writeStudent(List<Student> students, PrintWriter pw) {
        for (Student i : students) {
            pw.print(i.getId() + "|");
            pw.print(i.getName() + "|");
            pw.print(i.getAge() + "|");
            pw.print(i.getGrade());
            pw.println();
        }
    }

    public static void writeStudent(List<Student> students, DataOutputStream dos) throws IOException {
        dos.writeInt(students.size());
        for (Student s : students) {
            writeStudent(s, dos);
        }
    }
    public static void writeStudent(Student s, DataOutputStream dos) throws IOException {
        dos.writeInt(s.getId());
        dos.writeUTF(s.getName());
        dos.writeInt(s.getAge());
        dos.writeDouble(s.getGrade());
    }



    public static List<Student> readStudent(DataInputStream dis) throws IOException {
        int size = dis.readInt();
        List<Student> students = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            int id = dis.readInt();
            String name = dis.readUTF();
            int age = dis.readInt();
            double grade = dis.readDouble();
            students.add(new Student(id, name, age, grade));
        }
        return students;
    }

}

