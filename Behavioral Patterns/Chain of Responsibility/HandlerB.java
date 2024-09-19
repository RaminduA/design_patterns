public class HandlerB implements Chain {
    private Chain next;

    @Override
    public void setNext(Chain next) {
        this.next = next;
    }

    @Override
    public void handleRequest(int request) {
        if (request == 2) {
            System.out.println("HandlerB is handling the request");
        } else if (next != null) {
            System.out.println("HandlerB is unable to handle the request. Passing it to the next handler");
            next.handleRequest(request);
        } else {
            System.out.println("HandlerB is unable to handle the request");
            System.out.println("No handler in the chain can handle the request");
        }
    }
}
