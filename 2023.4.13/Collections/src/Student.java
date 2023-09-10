public class Student {
    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade) {
        super();
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
    }
}
