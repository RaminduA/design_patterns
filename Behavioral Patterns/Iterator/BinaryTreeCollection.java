public class BinaryTreeCollection implements IterableCollection {
    private BinaryTree tree;

    public BinaryTreeCollection() {
        this.tree = null;
    }

    public BinaryTree getTree() {
        return this.tree;
    }

    public void addNode(int value) {
        if (this.tree == null) {
            this.tree = new BinaryTree(value);
        } else {
            this.tree.addNode(value);
        }
    }

    public void removeNode(int value) {
        if (this.tree == null) {
            System.out.println("The tree is empty");
        } else {
            if (value == this.tree.getValue()) {
                if (!tree.hasLeft() && !tree.hasRight()) {
                    // Node is a leaf
                    tree = null;
                } else if (tree.hasLeft() && !tree.hasRight()) {
                    // Node has only left child
                    tree = tree.getLeft();
                } else if (!tree.hasLeft() && tree.hasRight()) {
                    // Node has only right child
                    tree = tree.getRight();
                } else {
                    // Node has both children
                    tree = tree.getLeft();
                }
            } else {
                tree.removeNode(value);
            }
        }
    }

    @Override
    public Iterator createIterator(IteratorType type) {
        return switch (type) {
            case BFS -> new BFSIterator(this);
            case DFS -> new DFSIterator(this);
        };
    }
}
