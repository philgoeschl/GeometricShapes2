package fh.java.geometricshapes.model.threedim;

/**
 * Created by Philipp Göschl on 09.11.2016.
 */
public class Kugel extends ThreeDim {

    private double radius;

    public Kugel() {
    }

    public Kugel(int x, int y, int z, double radius) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcVolume() {
        return 4.0/3*Math.PI*radius*radius*radius;
    }

    @Override
    public double calcSurfaceArea() {
        return 4*Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Kugel{");
        sb.append("radius=").append(radius);
        sb.append(", volume=").append(calcVolume());
        sb.append(", surface area=").append(calcSurfaceArea());
        sb.append('}');
        return sb.toString();
    }
}
