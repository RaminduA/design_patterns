public class CommandMain {
    public static void main(String[] args) {
        Receiver receiver1 = new ReceiverA();
        Receiver receiver2 = new ReceiverB();

        Command command1 = new CommandA(receiver1);
        Command command2 = new CommandB(receiver1);
        Command command3 = new CommandA(receiver2);
        Command command4 = new CommandB(receiver2);

        Invoker invoker1 = new Invoker(command1);
        Invoker invoker2 = new Invoker(command2);
        Invoker invoker3 = new Invoker(command3);
        Invoker invoker4 = new Invoker(command4);

        invoker1.executeCommand();
        invoker2.executeCommand();
        invoker3.executeCommand();
        invoker4.executeCommand();
    }
}
