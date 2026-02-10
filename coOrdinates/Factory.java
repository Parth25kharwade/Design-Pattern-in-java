package coOrdinates;

public class Factory {
    public Point getPoint(int... args){
        if(args.length == 2) {
            return new TwoDPoint( args[0], args[1]);
        } else if (args.length == 3) {
            return new ThreeDPoint(args[0], args[1], args[2]);
        } else {
            throw new IllegalArgumentException();
        }

    }
}
