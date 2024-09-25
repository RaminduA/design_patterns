public class VisitorMain {
    public static void main(String[] args) {
        Visitor visitorA = new VisitorA();
        ElementA element1 = new ElementA();
        ElementB element2 = new ElementB();
        ElementC element3 = new ElementC();
        element1.accept(visitorA);
        element2.accept(visitorA);
        element3.accept(visitorA);

        Visitor visitorB = new VisitorB();
        ElementA element4 = new ElementA();
        ElementB element5 = new ElementB();
        ElementC element6 = new ElementC();
        element4.accept(visitorB);
        element5.accept(visitorB);
        element6.accept(visitorB);
    }
}
