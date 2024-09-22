public class StateMain {
    public static void main(String[] args) {
        Context context = new Context();
        context.preformAction1();
        context.preformAction2();
        context.preformAction3();
        context.preformAction2();
        context.preformAction1();
        context.preformAction3();
        context.preformAction2();
    }
}
