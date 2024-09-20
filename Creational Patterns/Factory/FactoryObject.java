public abstract class FactoryObject {
    private FactoryType type;

    public void setType(FactoryType type) {
        this.type = type;
    }

    public void doSomething() {
        System.out.println("Doing the task with object " + type);
    }
}
