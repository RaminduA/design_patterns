public class StateB implements State {
    private final Context context;

    public StateB(Context context) {
        this.context = context;
    }

    public void preformAction1() {
        System.out.println("StateB: Action1. Moving from state B to state A");
        context.setState(context.getStateA());
    }

    public void preformAction2() {
        System.out.println("Can't perform action 2 in state B");
    }

    public void preformAction3() {
        System.out.println("Can't perform action 3 in state B");
    }
}
