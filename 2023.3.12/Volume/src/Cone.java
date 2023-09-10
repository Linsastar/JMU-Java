import static java.lang.Math.pow;

public class Cone {
    double r,high;
    Cone(int r,int high){
        this.high=high;
        this.r=r;
    }
    double getSurfaceArea(){
        return 3.1415926*r*r+3.1415926*r*pow(r*r+high*high,0.5);
    }
    double getVolume(){
        return 1/3.0*3.1415926*3.1415926*r*r*high;
    }
}
