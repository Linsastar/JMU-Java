import java.util.*;
public class Test {
    public static void main(String[] args) {
        List<String> nameList = Util.generateNameList(10000000);
        List<Student> students = Util.getRandomStudents(10000000);
        Map<String, Student> stuMap = Util.makeStudentMap(students);

        long start = System.currentTimeMillis();
        Util.searchName(nameList, "admin");
        long end = System.currentTimeMillis();
        System.out.println("searchName: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        Util.searchStudent(stuMap, "admin");
        end = System.currentTimeMillis();
        System.out.println("searchStudent: " + (end - start) + " ms");


        Map<String, Student> map = Util.generateStudentMap(100);

        Set<String> keySet = map.keySet();
        int count1 = 0;
        for (String key : keySet) {
            System.out.print(key + " ");
            count1++;
            if (count1 >= 10) {
                break;
            }
        }

        System.out.println();

        Collection<Student> values = map.values();
        int count2 = 0;
        for (Student s : values) {
            System.out.print(s.getName() + " ");
            count2++;
            if (count2 >= 10) {
                break;
            }
        }

        System.out.println();

        Set<Map.Entry<String, Student>> entrySet = map.entrySet();
        int count3 = 0;
        for (Map.Entry<String, Student> entry : entrySet) {
            System.out.print(entry.getKey() + "=" + entry.getValue().getName() + " ");
            count3++;
            if (count3 >= 10) {
                break;
            }
        }

    }
}
