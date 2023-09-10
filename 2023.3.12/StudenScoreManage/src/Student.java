public class Student {
    private String name,math,java,ds,avg,total;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public String getJava() {
        return java;
    }

    public void setJava(String java) {
        this.java = java;
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    public String getAvg() {
        return avg;
    }

    public void setAvg() {
        double num=Integer.parseInt(this.total);
        this.avg = String.valueOf(num/3.0);
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total =String.valueOf(this.math+this.ds+this.java);
    }

    public Student(String name, String math, String java, String ds) {
        this.name = name;
        this.math = math;
        this.java = java;
        this.ds = ds;
    }
    public Student(String name, String math, String java, String ds, String total,String avg) {
        this.name = name;
        this.math = math;
        this.java = java;
        this.ds = ds;
        this.avg = avg;
        this.total = total;
    }
    public String toString(){
        return "名字为："+this.name+" 数学成绩为："+this.math+" Java成绩为："+this.java+" Ds成绩为："+this.ds+
                " 平均成绩为："+this.avg+" 总成绩为："+this.total;
    }
}