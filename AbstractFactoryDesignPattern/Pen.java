package AbstractFactoryDesignPattern;

public class Pen {


    private Tube tube;
    private Refill refill;
    public Pen(Refill refill, Tube tube) {
        this.refill = refill;
        this.tube = tube;
    }
    public Pen(){

    }

    public Tube getTube() {
        return tube;
    }

    public void setTube(Tube tube) {
        this.tube = tube;
    }

    public Refill getRefill() {
        return refill;
    }

    public void setRefill(Refill refill) {
        this.refill = refill;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "tube=" + tube +
                ", refill=" + refill +
                '}';
    }
}
