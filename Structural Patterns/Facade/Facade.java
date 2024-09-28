public class Facade {
    private final SubsystemA subsystemA;
    private final SubsystemB subsystemB;
    private final SubsystemC subsystemC;

    public Facade() {
        subsystemA = new SubsystemA();
        subsystemB = new SubsystemB();
        subsystemC = new SubsystemC();
    }

    public void executeOperationA() {
        subsystemA.operationA();
    }

    public void executeOperationB() {
        subsystemB.operationB();
    }

    public void executeOperationC() {
        subsystemC.operationC();
    }
}
