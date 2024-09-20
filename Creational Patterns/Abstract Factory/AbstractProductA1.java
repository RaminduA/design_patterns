public class AbstractProductA1 extends AbstractProduct {
    AbstractFactory factory;

    public AbstractProductA1(AbstractFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create() {
        count = factory.assignCount();
        cost = factory.assignCost();
        System.out.println("Creating AbstractProductA1");
    }

    @Override
    public void doThis() {
        System.out.println("Doing this with AbstractProductA1");
    }

    @Override
    public void doThat() {
        System.out.println("Doing that with AbstractProductA1");
    }
}
