package AbstractFactoryDesignPattern;

public class MetalTube implements Tube{
    @Override
    public Tube createTube() {
        System.out.println("MetalTube Created....");
        return new MetalTube();
    }
}
