public interface Prototype extends Cloneable {
    Prototype copy();
    void doThis();
    void doThat();
    String getAttributes();
}
