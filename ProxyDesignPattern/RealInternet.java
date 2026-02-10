package ProxyDesignPattern;

public class RealInternet implements Internet{

    @Override
    public void connectTo(String link) throws Exception {
        System.out.println("connected Successfully "+ link);
    }
}
