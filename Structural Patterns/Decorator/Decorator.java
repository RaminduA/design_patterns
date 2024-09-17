public abstract class Decorator implements Base {
    protected Base base;

    public Decorator(Base base) {
        this.base = base;
    }

    public int getValue() {
        return base.getValue();
    }

    public String getIngredients() {
        return base.getIngredients();
    }
}
