package fh.java.geometricshapes.model.twodim;

/**
 * Created by Philipp Göschl on 09.11.2016.
 */
public class Dreieck extends TwoDim {

    private int a;
    private int b;
    private int c;
    private int h;

    public Dreieck() {
    }

    public Dreieck(int x, int y, int a, int b, int c, int h) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double calcArea() {
        return 1.0/2.0*c*h;
    }

    @Override
    public double calcPerimeter() {
        return a+b+c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Dreieck dreieck = (Dreieck) o;

        if (a != dreieck.a) return false;
        if (b != dreieck.b) return false;
        if (c != dreieck.c) return false;
        return h == dreieck.h;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + a;
        result = 31 * result + b;
        result = 31 * result + c;
        result = 31 * result + h;
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Dreieck{");
        sb.append("a=").append(a);
        sb.append(", b=").append(b);
        sb.append(", c=").append(c);
        sb.append(", h=").append(h);
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());
        sb.append('}');
        return sb.toString();
    }
}
