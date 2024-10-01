public class BridgeMain {
    public static void main(String[] args) {
        Abstraction abstraction1 = new RefinedAbstractionA(new ConcreteImplementationA());
        abstraction1.execute();

        Abstraction abstraction2 = new RefinedAbstractionB(new ConcreteImplementationB());
        abstraction2.execute();

        Abstraction abstraction3 = new RefinedAbstractionA(new ConcreteImplementationB());
        abstraction3.execute();

        Abstraction abstraction4 = new RefinedAbstractionB(new ConcreteImplementationA());
        abstraction4.execute();
    }
}
