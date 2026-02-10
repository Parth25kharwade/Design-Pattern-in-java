package coOrdinates;

public class ThreeDPoint implements Point{
    int x;
    int y;
    int z;

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

    public ThreeDPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    @Override
    public double length(Point p) {
        if (p instanceof ThreeDPoint) {
            return Math.sqrt(Math.pow(((ThreeDPoint) p).getX() - this.x, 2)
                    + Math.pow(((ThreeDPoint) p).getY() - this.y, 2)
                    + Math.pow(((ThreeDPoint) p).getZ() - this.z, 2));
        }else if (p instanceof TwoDPoint) {
            return Math.sqrt(Math.pow(((TwoDPoint) p).getX() - this.x, 2)
                    + Math.pow(((TwoDPoint) p).getY() - this.y, 2)
                    + Math.pow(this.z, 2));
        } else {
            throw new IllegalArgumentException();
        }
    }
}
