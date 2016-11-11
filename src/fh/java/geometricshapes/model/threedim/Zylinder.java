package fh.java.geometricshapes.model.threedim;

/**
 * Created by Philipp Göschl on 09.11.2016.
 */
public class Zylinder extends ThreeDim {

    private int radius;
    private int h;

    public Zylinder() {
    }

    public Zylinder(int x, int y, int z, int radius, int h) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.radius = radius;
        this.h = h;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double calcVolume() {
        return radius*radius+Math.PI*h;
    }

    @Override
    public double calcSurfaceArea() {
        return 2*Math.PI*radius*(radius+h);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Zylinder{");
        sb.append("radius=").append(radius);
        sb.append(", h=").append(h);
        sb.append(", volume=").append(calcVolume());
        sb.append(", surface area=").append(calcSurfaceArea());
        sb.append('}');
        return sb.toString();
    }
}
