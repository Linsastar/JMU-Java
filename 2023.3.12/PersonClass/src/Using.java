
public class Using {
    public static void main(String[] args) {
        Person a = new Person();
        TestPerson.test(a);
    }

    public static class TestPerson {
        static Person j = new Person();

        public static void test(Person args) {
            System.out.println(j.toString());
        }
    }

    private static class Person {
        private String name, sex, age;

        Person() {
            this.age = "0";
            this.sex = "男";
            this.name = "";
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String toString() {
            String Export = ("姓名为：" + this.name + " " + "性别为：" + this.sex + " " + "年龄为：" + this.age);
            return Export;
        }
    }
}
