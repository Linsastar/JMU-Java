import static java.lang.Math.pow;

public class QuadraticEquation {
    public QuadraticEquation() {

    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    private int a,b,c;
    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double getDiscriminant(){
        return this.b*this.b-4.0*this.a*this.c;
    }
    double getRoot1(){
        double r1;
        r1=(-b+pow((b*b-4*a*c),0.5))/2*a;
        return r1;
    }
    double getRoot2(){
        double r2;
        r2=(-b-pow((b*b-4*a*c),0.5))/2*a;
        return r2;
    }
}
