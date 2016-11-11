package fh.java.geometricshapes.model.twodim;

/**
 * Created by Philipp Göschl on 09.11.2016.
 */
public class Raute extends TwoDim {

    private int a;
    private int e;
    private int f;

    public Raute() {
    }

    public Raute(int x, int y, int a, int e, int f) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.e = e;
        this.f = f;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Raute raute = (Raute) o;

        if (a != raute.a) return false;
        if (e != raute.e) return false;
        return f == raute.f;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + a;
        result = 31 * result + e;
        result = 31 * result + f;
        return result;
    }

    @Override
    public double calcArea() {
        return e*f/2.0;
    }

    @Override
    public double calcPerimeter() {
        return 4*a;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Raute{");
        sb.append("a=").append(a);
        sb.append(", e=").append(e);
        sb.append(", f=").append(f);
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());
        sb.append('}');
        return sb.toString();
    }
}
