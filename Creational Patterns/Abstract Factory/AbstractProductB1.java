public class AbstractProductB1 extends AbstractProduct {
    AbstractFactory factory;

    public AbstractProductB1(AbstractFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create() {
        count = factory.assignCount();
        cost = factory.assignCost();
        System.out.println("Creating AbstractProductB1");
    }

    @Override
    public void doThis() {
        System.out.println("Doing this with AbstractProductB1");
    }

    @Override
    public void doThat() {
        System.out.println("Doing that with AbstractProductB1");
    }
}
