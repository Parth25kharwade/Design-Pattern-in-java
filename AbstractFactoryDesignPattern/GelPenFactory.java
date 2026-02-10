package AbstractFactoryDesignPattern;

public class GelPenFactory {
    public Pen getPen(){
        return new Pen(createRefill(),createTube());
    }

    private Tube createTube() {
        MetalTube mt=new MetalTube();
        return mt.createTube();

    }

    private Refill createRefill() {
        PlasticRefill pr=new PlasticRefill();
        return pr.createRefill();
    }


}
