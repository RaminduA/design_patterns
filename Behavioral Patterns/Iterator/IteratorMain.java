public class IteratorMain {
    public static void main(String[] args) {
        BinaryTreeCollection tree = new BinaryTreeCollection();

        tree.addNode(10);
        tree.addNode(5);
        tree.addNode(15);
        tree.addNode(3);
        tree.addNode(7);
        tree.addNode(12);
        tree.addNode(17);

        System.out.println("Breadth First Iterator");
        Iterator iteratorBfs = tree.createIterator(IteratorType.BFS);

        while (iteratorBfs.hasMore()) {
            System.out.println(iteratorBfs.getNext());
        }

        System.out.println("Depth First Iterator");
        Iterator iteratorDfs = tree.createIterator(IteratorType.DFS);

        while (iteratorDfs.hasMore()) {
            System.out.println(iteratorDfs.getNext());
        }
    }
}
