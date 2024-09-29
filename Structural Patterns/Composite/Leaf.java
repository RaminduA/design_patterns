public class Leaf implements Node {
    private String name;

    public Leaf(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void execute() {
        System.out.println("Leaf: " + getName());
    }
}
