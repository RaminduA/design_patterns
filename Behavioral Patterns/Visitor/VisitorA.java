public class VisitorA implements Visitor {
    @Override
    public void visit(ElementA element) {
        System.out.println("Hey there, VisitorA visited ElementA");
    }

    @Override
    public void visit(ElementB element) {
        System.out.println("Hi, VisitorA visited ElementB");
    }

    @Override
    public void visit(ElementC element) {
        System.out.println("Hello hello, VisitorA visited ElementC");
    }
}
