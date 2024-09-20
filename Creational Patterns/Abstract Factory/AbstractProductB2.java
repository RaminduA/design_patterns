public class AbstractProductB2 extends AbstractProduct {
    AbstractFactory factory;

    public AbstractProductB2(AbstractFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create() {
        count = factory.assignCount();
        cost = factory.assignCost();
        System.out.println("Creating AbstractProductB2");
    }

    @Override
    public void doThis() {
        System.out.println("Doing this with AbstractProductB2");
    }

    @Override
    public void doThat() {
        System.out.println("Doing that with AbstractProductB2");
    }
}
