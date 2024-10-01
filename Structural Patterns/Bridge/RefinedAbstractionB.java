public class RefinedAbstractionB extends Abstraction {
    public RefinedAbstractionB(Implementation implementation) {
        super(implementation);
    }

    @Override
    void action1() {
        System.out.println("RefinedAbstractionB: action1");
    }

    @Override
    void action2() {
        System.out.println("RefinedAbstractionB: action2");
    }

    @Override
    void action3() {
        System.out.println("RefinedAbstractionB: action3");
    }
}
