public class Main {
    static int count=0;
    /*(1)为题1中的Person类添加两个属性：身份证号int id(不要求与真正的身份证类似，不要使用随机数生成；这里的id只是一个简单的整型值，每个Person对象均不同即可。如，可以从1开始编号，第一个Person对象的id为1，第二个为2，以此类推)，静态变量(类变量)static int count(用于记录身份证号自动增长的历史)。

    (2)在构造方法中对id进行初始化，并使得每个生成对象的id均不同。

    (3)为Person类创建两个构造方法：第一个为包含两个参数的构造方法，可根据提供的“name”、“age”参数，对姓名、年龄属性进行初始化；第二个构造函数包含三个参数name,age,sex，使用构造方法重载技术，调用第一个构造方法，并额外对sex属性进行初始化。

    (4)覆盖Person类中的toString方法，输出Person的基本信息。选择适当的测试语句，测试本题中的改动。*/
    private static class Person{
        private String name,sex,age;
        private int id;
        {
            id=count;
            count++;
        }
        Person(String name,String age){
            this.name=name;
            this.age=age;
        }
        Person(String name, String sex, String age) {
            this.name=name;
            this.age=age;
            this.sex = sex;
        }
        public String toString(){
            String Export=("id为："+id+" 姓名为："+this.name+" "+"性别为："+this.sex+" "+"年龄为："+this.age);
            return Export;
        }
    }
    public static void main(String[] args) {
        Person[] person=new Person[10];
        for(int i=0;i<10;i++){
            String u=String.format(String.valueOf(i)).toString();
//            person[i].name="张三"+u;
//            person[i].age=
            person[i]= new Person("张三"+u,"男","18");
        }
        for(int j=0;j<10;j++){
            System.out.println(person[j].toString());
        }
    }
}
