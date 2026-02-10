package BuilderDesignPattern;

public class LaptopBuilder implements  GadegetBuilder{
    Laptop laptop=new Laptop();
    LaptopBuilder(){
        laptop=new Laptop("Default os",4,5);
    }
    public LaptopBuilder setOs(String str){
        laptop.setOs(str);
        return this;
    }
    public LaptopBuilder setRam(int ram){
        laptop.setRam(ram);
        return this;
    }
    public LaptopBuilder setScreenSize(int ss){
        laptop.setScreenSize(ss);
        return this;
    }
    public Laptop getGadget(){
        return this.laptop;
    }
}
