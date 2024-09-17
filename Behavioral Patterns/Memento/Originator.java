public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public Memento save() {
        System.out.println("Originator saving state: " + state);
        return new Memento(state);
    }

    public void restore(Memento memento) {
        state = memento.getState();
        System.out.println("Originator restoring state: " + state);
    }
}
