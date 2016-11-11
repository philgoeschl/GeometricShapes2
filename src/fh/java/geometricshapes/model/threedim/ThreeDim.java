package fh.java.geometricshapes.model.threedim;

import fh.java.geometricshapes.GeometricShapes;

/**
 * Created by Philipp Göschl on 09.11.2016.
 */
public abstract class ThreeDim extends GeometricShapes {

    protected int x;
    protected int y;
    protected int z;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ThreeDim threeDim = (ThreeDim) o;

        if (x != threeDim.x) return false;
        if (y != threeDim.y) return false;
        return z == threeDim.z;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + z;
        return result;
    }

    public abstract double calcVolume();
    public abstract double calcSurfaceArea();

}
