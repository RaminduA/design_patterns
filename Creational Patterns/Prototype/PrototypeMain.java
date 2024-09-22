public class PrototypeMain {
    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype("value1", "value2");
        System.out.println(prototype);
        System.out.println(prototype.getAttributes());
        prototype.doThis();
        prototype.doThat();

        Prototype clone = prototype.copy();
        System.out.println(clone);
        System.out.println(clone.getAttributes());
        clone.doThis();
        clone.doThat();

        System.out.println(prototype.equals(clone));
    }
}
