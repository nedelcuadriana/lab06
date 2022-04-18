package ro.ase.cts.lab06.Proxy;

public class InternetProvider implements Internet{

    @Override
    public void connectToUrl(String url){
        System.out.println("conectat cu succes la " + url);
    }
}
