package vol;

import java.util.Objects;

import static java.lang.Math.pow;

public class Cone extends Geometry {
    String name="Cone";
    private double r, high;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cone cone = (Cone) o;
        return Double.compare(cone.r, r) == 0 && Double.compare(cone.high, high) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r, high);
    }

    @Override
    public String toString() {
        return "Cone{" +
                "r=" + r +
                ", high=" + high +
                '}';
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public Cone(int r, int high) {
        this.high = high;
        this.r = r;
    }

    public double getSurfaceArea() {
        return PI * r * r + PI * r * pow(r * r + high * high, 0.5);
    }

    public double getVolume() {
        return 1 / 3.0 * PI * PI * r * r * high;
    }
}
