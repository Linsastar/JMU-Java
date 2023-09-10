import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入球1的半径：");
        int r1=in.nextInt();
        TestGeometry(r1);
        System.out.println("请输入球2的半径：");
        int r2=in.nextInt();
        TestGeometry(r2);
        int length,wide,high;
        System.out.println("请输入长方体1的长：");
        length=in.nextInt();
        System.out.println("请输入长方体1的宽：");
        wide=in.nextInt();
        System.out.println("请输入长方体1的高：");
        high=in.nextInt();
        TestGeometry(length,wide,high);
        System.out.println("请输入长方体2的长：");
        length=in.nextInt();
        System.out.println("请输入长方体2的宽：");
        wide=in.nextInt();
        System.out.println("请输入长方体2的高：");
        high=in.nextInt();
        TestGeometry(length,wide,high);
        int r3,high2;
        System.out.println("请输入圆锥1的半径：");
        r3= in.nextInt();
        System.out.println("请输入圆锥1的高：");
        high2= in.nextInt();
        TestGeometry(r3,high2);
        System.out.println("请输入圆锥2的半径：");
        r3= in.nextInt();
        System.out.println("请输入圆锥2的高：");
        high2= in.nextInt();
        TestGeometry(r3,high2);
    }
    public static String format5(double value) {
        return String.format("%.2f", value);
    }
    public static void TestGeometry(int r){//球体
        TestGeometry(r,0,0,0);
        Spheroid sphere=new Spheroid(r);
        System.out.println("该球的表面积为："+format5(sphere.getSurfaceArea()));
        System.out.println("该球的体积为："+format5(sphere.getVolume()));
    }
    public static void TestGeometry(int length, int wide, int high){//长方体
        TestGeometry(0,length,wide,high);
        Cuboid Cubo=new Cuboid(length,wide,high);
        System.out.println("该长方体的表面积为："+format5(Cubo.getSurfaceArea()));
        System.out.println("该长方体的体积为："+format5(Cubo.getVolume()));
    }
    public static void TestGeometry(int r,int high){
        TestGeometry(r,0,0,high);
        Cone cone=new Cone(r, high);
        System.out.println("该圆锥的表面积为："+format5(cone.getSurfaceArea()));
        System.out.println("该圆锥的体积为："+format5(cone.getVolume()));
    }
    public static void TestGeometry(int r, int length, int wide, int high){//总类

    }
}
