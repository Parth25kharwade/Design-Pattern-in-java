package BuilderDesignPattern;

public interface GadegetBuilder {
    GadegetBuilder setOs(String str);
    GadegetBuilder setRam(int ram);
    GadegetBuilder setScreenSize(int ss);
}
