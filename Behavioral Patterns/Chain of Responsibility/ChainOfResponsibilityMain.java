public class ChainOfResponsibilityMain {
    public static void main(String[] args) {
        Chain handlerA = new HandlerA();
        Chain handlerB = new HandlerB();
        Chain handlerC = new HandlerC();

        handlerA.setNext(handlerB);
        handlerB.setNext(handlerC);

        System.out.println("\nSending request 1 to the chain");
        handlerA.handleRequest(1);
        System.out.println("\nSending request 2 to the chain");
        handlerA.handleRequest(2);
        System.out.println("\nSending request 3 to the chain");
        handlerA.handleRequest(3);
        System.out.println("\nSending request 4 to the chain");
        handlerA.handleRequest(4);
    }
}
