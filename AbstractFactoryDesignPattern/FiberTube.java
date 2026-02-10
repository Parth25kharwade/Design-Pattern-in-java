package AbstractFactoryDesignPattern;

public class FiberTube implements Tube{
    @Override
    public Tube createTube() {
        System.out.println("FiberTube created....");
        return new FiberTube();
     }
}
