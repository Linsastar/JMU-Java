package vol;

import java.util.Objects;

public class Cuboid extends Geometry {
    private double length;
    double wide;
    double high;

    @Override
    public String toString() {
        return "Cuboid{" +
                "length=" + length +
                ", wide=" + wide +
                ", high=" + high +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuboid cuboid = (Cuboid) o;
        return Double.compare(cuboid.length, length) == 0 && Double.compare(cuboid.wide, wide) == 0 && Double.compare(cuboid.high, high) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, wide, high);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public Cuboid(double length, double wide, double high) {
        this.length = length;
        this.wide = wide;
        this.high = high;
    }

    @Override
    public double getSurfaceArea() {
        return (this.high * this.length + this.wide * this.high + this.length * this.wide) * 2;
    }

    @Override
    public double getVolume() {
        return this.high * this.length * this.wide;
    }
}
