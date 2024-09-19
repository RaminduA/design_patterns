public interface Chain {
    void setNext(Chain next);
    void handleRequest(int request);
}
