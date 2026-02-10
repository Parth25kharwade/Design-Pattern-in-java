package ProxyDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private Internet internet;
    public ProxyInternet(){
        internet=new RealInternet();
    }
   private static List<String> bannedSites=new ArrayList<>();
   static {
       bannedSites.add("abc.com");
       bannedSites.add("xyz.com");
       bannedSites.add("pqr.com");
       bannedSites.add("amxx.com");
   }


    @Override
    public void connectTo(String link) throws Exception {
        if(bannedSites.contains(link)){
            throw new Exception("Access Denied");
        }
        internet.connectTo(link);
    }
}
