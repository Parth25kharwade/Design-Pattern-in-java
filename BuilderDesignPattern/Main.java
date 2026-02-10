package BuilderDesignPattern;

public class Main {
    public static void main(String[] args) {
        Phone p;
        p=new Phone("Android",8,6);
        System.out.println(p);

        PhoneBuilder b1=new PhoneBuilder();
        p=b1.setOs("Android").setRam(8).setScreenSize(5).getGadget();
        System.out.println(p);

        System.out.println("-------------");

        Laptop l;
        l=new Laptop("Windows",8,6);
        System.out.println(p);

        LaptopBuilder l1=new LaptopBuilder();
        l=l1.setOs("Windows").setRam(8).setScreenSize(5).getGadget();
        System.out.println(l);
    }
}
