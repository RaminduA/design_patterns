public class StateA implements State {
    private final Context context;

    public StateA(Context context) {
        this.context = context;
    }

    public void preformAction1() {
        System.out.println("Can't perform action 1 in state A");
    }

    public void preformAction2() {
        System.out.println("StateA: Action2. Moving from state A to state B");
        context.setState(context.getStateB());
    }

    public void preformAction3() {
        System.out.println("StateA: Action3. Moving from state A to state C");
        context.setState(context.getStateC());
    }
}
