import vol.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Geometry[] geometries = new Geometry[]{
                new Cuboid(2, 3, 4),
                new Spheroid(2),
                new Cone(2, 3),
                new Cuboid(1, 2, 3),
                new Spheroid(1),
                new Cone(1, 2)
        };
        Arrays.sort(geometries);
        for (Geometry i:geometries){
            System.out.println("该立方体的面积为："+i.getSurfaceArea()+"\t该立方体的种类为："+i.getClass());
        }
    }
}
//为什么PI属性要使用final进行修饰？
/*很显然，这是个常量，要是在求值的过程中PI变了那么程序就失去了它的意义*/
/*
改写实验4中的抽象类Geometry，让其实现Comparable接口，实现对表面积的排序；在测试类中创建Geometry类型的数组或动态数组，里面有若干个Cubo
        id、Spheroid和Cone对象，然后利用Arrays.sort或Collections.sort对该Geometry数组或动态数组进行排序；输出排序后Geometry数组。*/
