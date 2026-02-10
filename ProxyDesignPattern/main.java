package ProxyDesignPattern;

public class main {
    public static void main(String[] args) {
        Internet internet=new ProxyInternet();
        try{
            internet.connectTo("sanvi.com");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
