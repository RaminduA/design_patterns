public class ProxyServiceImpl implements ProxyService {
    public void proxyMethod1() {
        System.out.println("ProxyServiceImpl.proxyMethod1() called");
    }

    public void proxyMethod2() {
        System.out.println("ProxyServiceImpl.proxyMethod2() called");
    }

    public void nonProxyMethod1() {
        System.out.println("ProxyServiceImpl.nonProxyMethod1() called");
    }

    public void nonProxyMethod2() {
        System.out.println("ProxyServiceImpl.nonProxyMethod2() called");
    }
}
