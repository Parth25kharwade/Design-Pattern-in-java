package AbstractFactoryDesignPattern;

public class PlasticRefill implements Refill{
    @Override
    public Refill createRefill() {
        System.out.println("Plastic Refill Created....");
        return new PlasticRefill();
    }
}
