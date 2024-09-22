public class Context {
    private final State stateA;
    private final State stateB;
    private final State stateC;

    private State currentState;

    public Context() {
        stateA = new StateA(this);
        stateB = new StateB(this);
        stateC = new StateC(this);

        currentState = stateA;
    }

    public void setState(State state) {
        currentState = state;
    }

    public void preformAction1() {
        currentState.preformAction1();
    }

    public void preformAction2() {
        currentState.preformAction2();
    }

    public void preformAction3() {
        currentState.preformAction3();
    }

    public State getStateA() {
        return stateA;
    }

    public State getStateB() {
        return stateB;
    }

    public State getStateC() {
        return stateC;
    }
}
