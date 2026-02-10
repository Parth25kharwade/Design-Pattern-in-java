package AbstractFactoryDesignPattern;

public class PenFactory {
    public Pen getPen(String type){
        if(type.equals("Gel")){
            return new GelPenFactory().getPen();
        }else if(type.equals("Sketch")){
            return new SketchPenFactory().getPen();
        }else{
            throw new IllegalArgumentException();
        }
    }
}
