package ro.ase.cts.lab06.Proxy;

import java.util.ArrayList;
import java.util.List;


public class ProxyInternet implements Internet{
    private Internet isp = new InternetProvider();
    private List<String> bl =  new ArrayList<>();

    public ProxyInternet() {
        bl.add("facebook.com");
        bl.add("tiktok.com");
    }

    public void connectToUrl(String url){
        if(bl.contains(url.toLowerCase())) {
            System.out.println("Acces interzis la " + url);
        } else {
            isp.connectToUrl(url);
        }
    }


}
