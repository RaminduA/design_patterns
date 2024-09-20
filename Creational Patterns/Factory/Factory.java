public class Factory {
    public static FactoryObject create(FactoryType type) {
        return switch (type) {
            case TYPE_A -> new FactoryObjectA();
            case TYPE_B -> new FactoryObjectB();
            case TYPE_C -> new FactoryObjectC();
        };
    }
}
