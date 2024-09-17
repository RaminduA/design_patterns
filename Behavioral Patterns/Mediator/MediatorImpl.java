import java.util.HashMap;
import java.util.Map;

public class MediatorImpl implements Mediator {
    private final Map<Integer, Component> components = new HashMap<>();
    private int componentCount = 0;

    @Override
    public void notify(Component sender, String event) {
        components.values().stream()
            .filter(component -> !component.equals(sender))
            .forEach(component -> component.receive(event));
    }

    @Override
    public void addComponent(Component component) {
        System.out.println("Component " + component.getId() + " added");
        components.put(component.getId(), component);
        componentCount++;
    }

    @Override
    public int getComponentCount() {
        return componentCount;
    }
}
