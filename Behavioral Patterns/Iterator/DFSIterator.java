public class DFSIterator implements Iterator {
    private final BinaryTreeCollection collection;
    private int index;

    public DFSIterator(BinaryTreeCollection collection) {
        this.collection = collection;
        index = 0;
    }

    @Override
    public boolean hasMore() {
        return index < collection.getTree().size();
    }

    @Override
    public int getNext() {
        return collection.getTree().getValueDfs(index++);
    }

    @Override
    public void reset() {
        index = 0;
    }
}
