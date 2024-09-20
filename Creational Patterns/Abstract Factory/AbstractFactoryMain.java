public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractBuilder builderA = new AbstractBuilderA();
        AbstractBuilder builderB = new AbstractBuilderB();

        AbstractProduct productA1 = builderA.order(AbstractFactoryType.TYPE_A_1);
        productA1.setId("A1");
        System.out.println(productA1);

        AbstractProduct productA2 = builderA.order(AbstractFactoryType.TYPE_A_2);
        productA2.setId("A2");
        System.out.println(productA2);

        AbstractProduct productB1 = builderB.order(AbstractFactoryType.TYPE_B_1);
        productB1.setId("B1");
        System.out.println(productB1);

        AbstractProduct productB2 = builderB.order(AbstractFactoryType.TYPE_B_2);
        productB2.setId("B2");
        System.out.println(productB2);
    }
}
