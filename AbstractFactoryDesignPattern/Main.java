package AbstractFactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        Pen pen;
        PenFactory penFactory=new PenFactory();

        pen=penFactory.getPen("Gel");
        System.out.println(pen);

        pen=penFactory.getPen("Sketch");
        System.out.println(pen);

    }

}
