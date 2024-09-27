public class BuilderMain {
    public static void main(String[] args) {
        Builder builder1 = new Builder1().buildStep1().buildStep3();
        Product product1 = builder1.getResult();

        Builder builder2 = new Builder2().buildStep2().buildStep3();
        Product product2 = builder2.getResult();

        builder1.reset();
        builder1.buildStep1().buildStep2().buildStep3();
        Product product3 = builder1.getResult();
    }
}
