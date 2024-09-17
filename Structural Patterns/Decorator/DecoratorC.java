public class DecoratorC extends Decorator {
    public DecoratorC(Base base) {
        super(base);
        System.out.println("Decorator C added");
    }

    @Override
    public int getValue() {
        return super.getValue() + 20;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Decorator C";
    }
}
