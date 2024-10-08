public class CommandB implements Command {
    private final Receiver receiver;

    public CommandB(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action2();
    }
}
