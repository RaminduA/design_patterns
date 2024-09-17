public class MediatorMain {
    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();

        Component componentA = new ComponentA(mediator);
        Component componentB = new ComponentB(mediator);
        Component componentC = new ComponentC(mediator);

        componentA.send("Hello guys");
        componentB.send("Hey there");
        componentC.send("Hi everyone");
    }
}
