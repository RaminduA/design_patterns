public class DecoratorB extends Decorator {
    public DecoratorB(Base base) {
        super(base);
        System.out.println("Decorator B added");
    }

    @Override
    public int getValue() {
        return super.getValue() + 30;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Decorator B";
    }
}
