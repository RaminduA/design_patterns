import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private final List<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento memento) {
        System.out.println("Caretaker add state: " + memento.getState());
        mementos.add(memento);
    }

    public Memento getMemento(int index) {
        System.out.println("Caretaker get state: " + mementos.get(index).getState());
        return mementos.get(index);
    }
}
