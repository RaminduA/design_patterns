public class DecoratorA extends Decorator {
    public DecoratorA(Base base) {
        super(base);
        System.out.println("Decorator A added");
    }

    @Override
    public int getValue() {
        return super.getValue() + 50;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Decorator A";
    }
}
