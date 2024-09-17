public class ConcreteBase implements Base {
    public ConcreteBase() {
        System.out.println("Base added");
    }

    @Override
    public int getValue() {
        return 100;
    }

    @Override
    public String getIngredients() {
        return "Base";
    }
}
