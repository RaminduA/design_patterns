public class BFSIterator implements Iterator {
    private final BinaryTreeCollection collection;
    private int index;

    public BFSIterator(BinaryTreeCollection collection) {
        this.collection = collection;
        index = 0;
    }

    @Override
    public boolean hasMore() {
        return index < collection.getTree().size();
    }

    @Override
    public int getNext() {
        return collection.getTree().getValueBfs(index++);
    }

    @Override
    public void reset() {
        index = 0;
    }
}
