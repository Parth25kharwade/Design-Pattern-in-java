package BuilderDesignPattern;

public class PhoneBuilder implements GadegetBuilder {
    Phone phone=new Phone();
    PhoneBuilder(){
        phone=new Phone("Default os",4,5);
    }
    public PhoneBuilder setOs(String str){
        phone.setOs(str);
       return this;
    }
    public PhoneBuilder setRam(int ram){
        phone.setRam(ram);
        return this;
    }
    public PhoneBuilder setScreenSize(int ss){
        phone.setScreenSize(ss);
        return this;
    }
    public Phone getGadget(){
        return this.phone;
    }
}
