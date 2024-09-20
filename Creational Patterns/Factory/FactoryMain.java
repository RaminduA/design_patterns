public class FactoryMain {
    public static void main(String[] args) {
        FactoryObject objectA = Factory.create(FactoryType.TYPE_A);
        FactoryObject objectB = Factory.create(FactoryType.TYPE_B);
        FactoryObject objectC = Factory.create(FactoryType.TYPE_C);

        objectA.doSomething();
        objectB.doSomething();
        objectC.doSomething();
    }
}
