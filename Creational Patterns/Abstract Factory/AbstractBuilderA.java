public class AbstractBuilderA extends AbstractBuilder {
    @Override
    protected AbstractProduct make(AbstractFactoryType type) {
        AbstractFactory factory;
        AbstractProduct product = null;

        switch (type) {
            case TYPE_A_1:
                factory = new AbstractFactoryA1();
                product = new AbstractProductA1(factory);
                break;
            case TYPE_A_2:
                factory = new AbstractFactoryA2();
                product = new AbstractProductA2(factory);
                break;
            default:
                break;
        }

        return product;
    }
}
