public class CompositeMain {
    public static void main(String[] args) {
        Composite root = new Composite();
        Composite branch1 = new Composite();
        Composite branch2 = new Composite();
        Composite branch3 = new Composite();
        Leaf leaf1 = new Leaf("leaf1");
        Leaf leaf2 = new Leaf("leaf2");
        Leaf leaf3 = new Leaf("leaf3");
        Leaf leaf4 = new Leaf("leaf4");
        Leaf leaf5 = new Leaf("leaf5");

        root.addChild(branch1);
        root.addChild(branch2);
        branch1.addChild(leaf1);
        branch1.addChild(leaf2);
        branch1.addChild(branch3);
        branch2.addChild(leaf3);
        branch2.addChild(leaf4);
        branch3.addChild(leaf5);

        System.out.println("Executing root: round 1");
        root.execute();

        branch1.removeChild(leaf2);

        System.out.println("\nExecuting root: round 2");
        root.execute();

        branch1.removeChild(branch3);

        System.out.println("\nExecuting root: round 3");
        root.execute();
    }
}
