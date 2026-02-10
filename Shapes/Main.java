package Shapes;

public class Main {
    public static void main(String[] args) {
        Shape s=null;
        s=new Square(4);
        s.draw();
        s=new Rectangle(4,5);
        s.draw();

    }
}
