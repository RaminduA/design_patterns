public class RefinedAbstractionA extends Abstraction {
    public RefinedAbstractionA(Implementation implementation) {
        super(implementation);
    }

    @Override
    void action1() {
        System.out.println("RefinedAbstractionA: action1");
    }

    @Override
    void action2() {
        System.out.println("RefinedAbstractionA: action2");
    }

    @Override
    void action3() {
        System.out.println("RefinedAbstractionA: action3");
    }
}
