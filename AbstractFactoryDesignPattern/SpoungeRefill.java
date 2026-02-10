package AbstractFactoryDesignPattern;

public class SpoungeRefill implements Refill{
    @Override
    public Refill createRefill() {
        System.out.println("Spounge Refill Created....");
        return new SpoungeRefill();
    }
}
