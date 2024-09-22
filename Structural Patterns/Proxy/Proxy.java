public class Proxy implements ProxyService {
    private final ProxyService proxyService;

    public Proxy() {
        this.proxyService = new ProxyServiceImpl();
    }

    public void proxyMethod1() {
        System.out.println("Proxy.proxyMethod1() called");
        proxyService.proxyMethod1();
    }

    public void proxyMethod2() {
        System.out.println("Proxy.proxyMethod2() called");
        proxyService.proxyMethod2();
    }
}
