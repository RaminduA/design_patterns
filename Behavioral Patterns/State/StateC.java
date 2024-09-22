public class StateC implements State {
    private final Context context;

    public StateC(Context context) {
        this.context = context;
    }

    public void preformAction1() {
        System.out.println("StateC: Action1. Moving from state C to state A");
        context.setState(context.getStateA());
    }

    public void preformAction2() {
        System.out.println("StateC: Action2. Moving from state C to state B");
        context.setState(context.getStateB());
    }

    public void preformAction3() {
        System.out.println("Can't perform action 3 in state C");
    }
}
