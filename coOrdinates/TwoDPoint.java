package coOrdinates;

public class TwoDPoint implements Point{
    int x;
    int y;

    public TwoDPoint(int y, int x) {
        this.y = y;
        this.x = x;
    }

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

    public double length(Point p) {
        if(p instanceof TwoDPoint){
            return Math.sqrt(Math.pow(((TwoDPoint) p).x - this.x, 2)
                    +  Math.pow(((TwoDPoint) p).y - this.y, 2));
        } else if(p instanceof ThreeDPoint){
            return Math.sqrt(Math.pow(((ThreeDPoint) p).getX() - this.x, 2)
                    + Math.pow(((ThreeDPoint) p).getY() - this.y, 2)
                    + Math.pow(((ThreeDPoint) p).getZ(), 2));
        } else{
            throw new IllegalArgumentException();
        }
    }
}
