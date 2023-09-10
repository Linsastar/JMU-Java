import vol.*;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(10, 10, 10);
        Spheroid spheroid = new Spheroid(10);
        Cone cone = new Cone(10, 20);
        ArrayList<Geometry> vol = new ArrayList<>();
        vol.add(cuboid);
        vol.add(spheroid);
        vol.add(cone);
        double SumSurfaceArea = cone.getSurfaceArea() + spheroid.getSurfaceArea() + cuboid.getSurfaceArea();
        double SumVolume = cone.getVolume() + spheroid.getVolume() + cuboid.getVolume();
        System.out.println("总表面积为：");
        System.out.printf("%.2f\n", SumSurfaceArea);
        System.out.println("总体积为：");
        System.out.printf("%.2f", SumVolume);
    }
}
//为什么PI属性要使用final进行修饰？
/*很显然，这是个常量，要是在求值的过程中PI变了那么程序就失去了它的意义*/
