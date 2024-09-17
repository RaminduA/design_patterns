public class MementoMain {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State 1");
        originator.setState("State 2");
        caretaker.addMemento(originator.save());

        originator.setState("State 3");
        caretaker.addMemento(originator.save());

        originator.setState("State 4");
        originator.restore(caretaker.getMemento(0));
    }
}
