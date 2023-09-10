public class Cuboid {
    double length,wide,high;
    Cuboid(int length, int wide, int high){
        this.high=high;
        this.wide=wide;
        this.length=length;
    }
    double getSurfaceArea(){
        return (length*high+high*wide+wide*length)*2;
    }
    double getVolume(){
        return length*wide*high;
    }
}
