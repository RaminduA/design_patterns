public abstract class Abstraction {
    protected final Implementation implementation;

    public Abstraction(Implementation implementation) {
        this.implementation = implementation;
    }

    abstract void action1();
    abstract void action2();
    abstract void action3();

    public void execute() {
        action1();
        action2();
        action3();
        implementation.step1();
        implementation.step2();
        System.out.println("Operation completed");
    }
}
