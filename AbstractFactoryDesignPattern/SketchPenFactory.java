package AbstractFactoryDesignPattern;

public class SketchPenFactory {
    public Pen getPen(){
        return new Pen(createRefill(),createTube());
    }

    private Tube createTube() {
        FiberTube ft=new FiberTube();
        return ft.createTube();
    }

    private Refill createRefill() {
        SpoungeRefill sr=new SpoungeRefill();
        return sr.createRefill();
    }
}
