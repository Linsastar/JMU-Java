package vol;

public abstract class Geometry implements Comparable<Geometry>{
    final static double PI=3.1415926535897;
    abstract public double getSurfaceArea();
    abstract public double getVolume();
    public int compareTo(Geometry other) {
        return Double.compare(this.getSurfaceArea(), other.getSurfaceArea());
    }
}
