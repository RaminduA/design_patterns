public abstract class AbstractProduct {
    private String id;
    int count;
    double cost;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    abstract void create();

    @Override
    public String toString() {
        return "Product: " + getId() + " Count: " + count + " Cost: " + cost;
    }

    abstract void doThis();
    abstract void doThat();
}
