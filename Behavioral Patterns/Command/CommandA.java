public class CommandA implements Command {
    private final Receiver receiver;

    public CommandA(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action1();
    }
}
