public class VariantC extends Template {
    public VariantC() {
        isOptionalStep1Present = false;
        isOptionalStep4Present = false;
    }

    @Override
    public void optionalStep1() { }

    @Override
    public void optionalStep2() {
        System.out.println("VariantC optionalStep2");
    }

    @Override
    public void optionalStep3() {
        System.out.println("VariantC optionalStep3");
    }

    @Override
    public void optionalStep4() { }
}
