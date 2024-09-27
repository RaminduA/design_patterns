public class BuilderMain {
    public static void main(String[] args) {
        Builder builder1 = new Builder1();
        Product product1 = builder1.getResult();
        Builder builder2 = new Builder2();
        Product product2 = builder2.getResult();
    }
}
