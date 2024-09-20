public class AbstractBuilderB extends AbstractBuilder {
    @Override
    protected AbstractProduct make(AbstractFactoryType type) {
        AbstractFactory factory;
        AbstractProduct product = null;

        switch (type) {
            case TYPE_B_1:
                factory = new AbstractFactoryB1();
                product = new AbstractProductB1(factory);
                break;
            case TYPE_B_2:
                factory = new AbstractFactoryB2();
                product = new AbstractProductB2(factory);
                break;
            default:
                break;
        }

        return product;
    }
}
