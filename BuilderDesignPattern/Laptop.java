package BuilderDesignPattern;

public class Laptop {
    private String os;
    private int ram;
    private int screenSize;

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", screenSize=" + screenSize +
                '}';
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public Laptop(){

    }

    public Laptop(String os, int ram, int screenSize) {
        this.os = os;
        this.ram = ram;
        this.screenSize = screenSize;
    }

}
