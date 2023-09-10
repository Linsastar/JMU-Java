package vol;

import java.util.Objects;

public class Spheroid extends Geometry {
    String name="Spheroid";
    private double r;

    @Override
    public String toString() {
        return "Spheroid{" +
                "r=" + r +
                '}';
    }

    public double getR() {
        return r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spheroid spheroid = (Spheroid) o;
        return Double.compare(spheroid.r, r) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r);
    }

    public Spheroid(double r) {
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * r * r;
    }

    @Override
    public double getVolume() {
        return (4 / 3) * PI * r * r * r;
    }
}
