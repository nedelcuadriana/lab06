package ro.ase.cts.lab06.Proxy;

public class Main {
    public static void main(String[] args) {
        Internet isp = new InternetProvider();
        Internet proxyInternet = new ProxyInternet();

        isp.connectToUrl("google.com");
        proxyInternet.connectToUrl("google.com");
        System.out.println("---------------");
        isp.connectToUrl("facebook.com");
        proxyInternet.connectToUrl("facebook.com");
    }

}
