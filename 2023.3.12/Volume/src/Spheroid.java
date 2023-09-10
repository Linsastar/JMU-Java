public class Spheroid{
    double r;
    Spheroid(double r){
        this.r=r;
    }
    double getSurfaceArea(){
        return 4*3.1415926*r*r;
    }
    double getVolume(){
        return (4.0/3.0)*3.1415926*r*r*r;
    }
}
