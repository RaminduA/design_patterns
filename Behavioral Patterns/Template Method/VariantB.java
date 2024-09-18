public class VariantB extends Template {
    public VariantB() {
        isOptionalStep1Present = false;
        isOptionalStep2Present = false;
    }

    @Override
    public void optionalStep1() { }

    @Override
    public void optionalStep2() { }

    @Override
    public void optionalStep3() {
        System.out.println("VariantB optionalStep3");
    }

    @Override
    public void optionalStep4() {
        System.out.println("VariantB optionalStep4");
    }
}
