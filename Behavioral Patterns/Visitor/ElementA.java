public class ElementA implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
