public class VariantA extends Template {
    public VariantA() {
        isOptionalStep3Present = false;
        isOptionalStep4Present = false;
    }

    @Override
    public void optionalStep1() {
        System.out.println("VariantA optionalStep1");
    }

    @Override
    public void optionalStep2() {
        System.out.println("VariantA optionalStep2");
    }

    @Override
    public void optionalStep3() { }

    @Override
    public void optionalStep4() { }
}
