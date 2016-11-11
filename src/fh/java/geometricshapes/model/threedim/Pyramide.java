package fh.java.geometricshapes.model.threedim;

/**
 * Created by Philipp Göschl on 09.11.2016.
 */
public class Pyramide extends ThreeDim {

    private int a;
    private int b;
    private int ha;
    private int hb;
    private int h;

    public Pyramide(int x, int y, int z, int a, int b, int ha, int hb, int h) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.a = a;
        this.b = b;
        this.ha = ha;
        this.hb = hb;
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

    public int getHa() {
        return ha;
    }

    public void setHa(int ha) {
        this.ha = ha;
    }

    public int getHb() {
        return hb;
    }

    public void setHb(int hb) {
        this.hb = hb;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double calcVolume() {
        return 1.0/3*a*b*h;
    }

    @Override
    public double calcSurfaceArea() {
        return a*b+a*ha+b*hb;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pyramide{");
        sb.append("a=").append(a);
        sb.append(", b=").append(b);
        sb.append(", ha=").append(ha);
        sb.append(", hb=").append(hb);
        sb.append(", h=").append(h);
        sb.append(", volume=").append(calcVolume());
        sb.append(", surface area=").append(calcSurfaceArea());
        sb.append('}');
        return sb.toString();
    }
}
