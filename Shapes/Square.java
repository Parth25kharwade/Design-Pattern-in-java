package Shapes;

public class Square extends Shape {
    int length;
    int breadth;

    public Square(int length) {
        this.length=length;
        this.breadth=length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
        this.length = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
        this.breadth = length;
    }

    @Override
    public void draw() {
        System.out.println("Area of Reactangle: "+length*breadth);
    }
}
