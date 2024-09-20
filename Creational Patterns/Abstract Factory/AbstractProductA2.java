public class AbstractProductA2 extends AbstractProduct {
    AbstractFactory factory;

    public AbstractProductA2(AbstractFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create() {
        count = factory.assignCount();
        cost = factory.assignCost();
        System.out.println("Creating AbstractProductA2");
    }

    @Override
    public void doThis() {
        System.out.println("Doing this with AbstractProductA2");
    }

    @Override
    public void doThat() {
        System.out.println("Doing that with AbstractProductA2");
    }
}
