package coOrdinates;

public class test {
    private static final Factory factory =  new Factory();

    public static void main(String[] args) {
        Point p1 = factory.getPoint(4, 6);
        Point p2 =  factory.getPoint(6, 9, 5);

        System.out.println(p1.length(p2));
        System.out.println(p2.length(p1));
    }
}
