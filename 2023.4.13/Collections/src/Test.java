import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[100];
        for (int i = 0; i < students.length; i++) {
            String name = Util.getRandomName(2, 6);
            int age = Util.getRandomAge(15, 25);
            int grade = Util.getRandomNumber(0, 100);
            students[i] = new Student(name, age, grade);
        }
        ArrayList<Student> studentList = new ArrayList<>();//将students数组转换成studentList(List类型)
        studentList.addAll(List.of(students));
        //使用Collections.sort对student的成绩进行排序
        Collections.sort(studentList, (s1, s2) -> s1.getGrade() - s2.getGrade());
        //使用Collections的min和max方法找到成绩最高的和成绩最低学生
        Student minStudent = Collections.min(studentList, (s1, s2) -> s1.getGrade() - s2.getGrade());

        Student maxStudent = Collections.max(studentList, (s1, s2) -> s1.getGrade() - s2.getGrade());

        //使用Collections的binarySearch查找成绩等于60的学生
        int index = Collections.binarySearch(studentList, new Student("", 0, 60), (s1, s2) -> s1.getGrade() - s2.getGrade());

        Student studentWithGrade60 = null;
        if (index >= 0) {
            studentWithGrade60 = studentList.get(index);
        }


        // 编写方法从studentList找出grade小于60的学生，放入otherList
        // 筛选出成绩小于60的学生
        List<Student> otherList = studentList.stream()
                .filter(s -> s.getGrade() < 60)
                .toList();



        //使用List的removeAll方法，从studentList中移除otherList
        try {
            studentList.removeAll(otherList);
        } catch (Exception e) {
            System.out.println("出现异常");
        }
        int wid=0;
        for (var g:
           studentList  ) {//输出每个人的成绩，可以看到小于六十的都被筛了
            System.out.print(g.getGrade()+" ");
            wid++;
            if(wid%5==0)
                System.out.println();
        }
        //使用Collections的shuffle方法，打乱studentList中学生排列的顺序
        Collections.shuffle(studentList);
        //将studentList转换为数组
        Student[] studentArray = studentList.toArray(new Student[studentList.size()]);
    }

}
