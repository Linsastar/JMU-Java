public class Main {
    static int count=0;
    /*(1)Ϊ��1�е�Person������������ԣ����֤��int id(��Ҫ�������������֤���ƣ���Ҫʹ����������ɣ������idֻ��һ���򵥵�����ֵ��ÿ��Person�������ͬ���ɡ��磬���Դ�1��ʼ��ţ���һ��Person�����idΪ1���ڶ���Ϊ2���Դ�����)����̬����(�����)static int count(���ڼ�¼���֤���Զ���������ʷ)��

    (2)�ڹ��췽���ж�id���г�ʼ������ʹ��ÿ�����ɶ����id����ͬ��

    (3)ΪPerson�ഴ���������췽������һ��Ϊ�������������Ĺ��췽�����ɸ����ṩ�ġ�name������age�����������������������Խ��г�ʼ�����ڶ������캯��������������name,age,sex��ʹ�ù��췽�����ؼ��������õ�һ�����췽�����������sex���Խ��г�ʼ����

    (4)����Person���е�toString���������Person�Ļ�����Ϣ��ѡ���ʵ��Ĳ�����䣬���Ա����еĸĶ���*/
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
            String Export=("idΪ��"+id+" ����Ϊ��"+this.name+" "+"�Ա�Ϊ��"+this.sex+" "+"����Ϊ��"+this.age);
            return Export;
        }
    }
    public static void main(String[] args) {
        Person[] person=new Person[10];
        for(int i=0;i<10;i++){
            String u=String.format(String.valueOf(i)).toString();
//            person[i].name="����"+u;
//            person[i].age=
            person[i]= new Person("����"+u,"��","18");
        }
        for(int j=0;j<10;j++){
            System.out.println(person[j].toString());
        }
    }
}
