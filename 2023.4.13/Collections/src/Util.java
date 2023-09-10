import java.util.*;

public class Util {
    /**
     * @param n 学生数量
     * @return 随机生成n个学生的列表
     */

    public static List<Student> getRandomStudents(int n) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = getRandomName(2, 6);
            int age = getRandomAge(15, 25);
            Student stu = new Student(name, age);
            students.add(stu);
        }
        return students;
    }

    /**
     * @param min 最小长度
     * @param max 最大长度
     * @return 返回长度在min到max之间随机名字
     */
    public static String getRandomName(int min, int max) {
        StringBuilder sb = new StringBuilder();

        int n = getRandomNumber(min, max);

        while (n > 0) {
            sb.append((char) getRandomNumber('a', 'z'));
            n--;
        }
        return sb.toString();
    }

    /**
     * @param min 最小年龄
     * @param max 最大年龄
     * @return 返回分布在[min, max]的随机整数
     */
    public static int getRandomAge(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("min =" + min + ">" + "max=" + max);
        }
        return min + new Random().nextInt(max + 1 - min);
    }


    /**
     * @param list 学生列表
     * @return 将List中每个Student的name作为key, Student对象本身作为value放入Map中，并返回。
     */
    public static Map<String, Student> makeStudentMap(List<Student> list) {
        Map<String, Student> map = new HashMap<>();
        for (Student s : list) {
            map.put(s.getName(), s);
        }
        return map;
    }

    /**
     * @param nameList 字符串列表
     * @param name     指定字符串
     * @return 根据指定的name返回相应的字符串，如果没有找到返回null。
     */
    public static String searchName(List<String> nameList, String name) {
        for (String s : nameList) {
            if (s.equals(name)) {
                return s;
            }
        }
        return null;
    }

    /**
     * @param stuMap 映射表
     * @param name   指定字符串
     * @return 根据指定的name返回相应的学生，如果没有找到返回null。
     */
    public static Student searchStudent(Map<String, Student> stuMap, String name) {
        return stuMap.get(name);
    }

    /**
     * @param n 数量
     * @return 生成n个字符串的NameList并返回
     */
    public static List<String> generateNameList(int n) {
        List<String> nameList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nameList.add(getRandomName(2, 6));
        }
        return nameList;
    }

    /**
     * @param n 学生数量
     * @return 生成包含n个键的的StudentMap并返回
     */
    public static Map<String, Student> generateStudentMap(int n) {
        List<Student> students = getRandomStudents(n);
        Map<String, Student> map = makeStudentMap(students);
        return map;
    }

    /**
     * @param min 最小值
     * @param max 最大值
     * @return 返回分布在[min, max]的随机整数
     */
    public static int getRandomNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("min =" + min + ">" + "max=" + max);
        }
        return min + new Random().nextInt(max + 1 - min);
    }


}
