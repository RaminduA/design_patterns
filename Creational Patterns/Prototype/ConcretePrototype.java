public class ConcretePrototype implements Prototype {
    private String attribute1;
    private String attribute2;

    public ConcretePrototype(String attribute1, String attribute2) {
        setAttribute1(attribute1);
        setAttribute2(attribute2);
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    @Override
    public Prototype copy() {
        ConcretePrototype prototype;
        try {
            prototype = (ConcretePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return prototype;
    }

    @Override
    public void doThis() {
        System.out.println("ConcretePrototypeA doThis");
    }

    @Override
    public void doThat() {
        System.out.println("ConcretePrototypeA doThat");
    }

    @Override
    public String getAttributes() {
        return "Attributes { " +
                "attribute1='" + getAttribute1() + '\'' +
                ", attribute2='" + getAttribute2() + '\'' +
                " }";
    }
}
