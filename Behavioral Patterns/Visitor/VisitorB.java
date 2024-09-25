public class VisitorB implements Visitor {
    @Override
    public void visit(ElementA element) {
        System.out.println("Hey folks, VisitorB visited ElementA");
    }

    @Override
    public void visit(ElementB element) {
        System.out.println("Long time no see, VisitorB visited ElementB");
    }

    @Override
    public void visit(ElementC element) {
        System.out.println("Hey there mates, VisitorB visited ElementC");
    }
}
