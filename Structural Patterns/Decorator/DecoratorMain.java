public class DecoratorMain {
    public static void main(String[] args) {
        Base base = new ConcreteBase();
        System.out.println(base.getIngredients());
        System.out.println(base.getValue());

        base = new DecoratorA(base);
        System.out.println(base.getIngredients());
        System.out.println(base.getValue());

        base = new DecoratorB(base);
        System.out.println(base.getIngredients());
        System.out.println(base.getValue());

        base = new DecoratorC(base);
        System.out.println(base.getIngredients());
        System.out.println(base.getValue());
    }
}
