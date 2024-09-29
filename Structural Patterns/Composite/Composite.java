import java.util.ArrayList;
import java.util.List;

public class Composite implements Node {
    private final List<Node> children = new ArrayList<Node>();

    public void addChild(Node child) {
        children.add(child);
    }

    public void removeChild(Node child) {
        children.remove(child);
    }

    public List<Node> getChildren() {
        return children;
    }

    public void execute() {
        for (Node child : children) {
            child.execute();
        }
    }
}
