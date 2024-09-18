public abstract class Template {
    boolean isOptionalStep1Present = true;
    boolean isOptionalStep2Present = true;
    boolean isOptionalStep3Present = true;
    boolean isOptionalStep4Present = true;

    public final void templateMethod() {
        compulsoryStep1();
        if (isOptionalStep1Present) optionalStep1();
        if (isOptionalStep2Present) optionalStep2();
        compulsoryStep2();
        if (isOptionalStep3Present) optionalStep3();
        if (isOptionalStep4Present) optionalStep4();
    }

    public void compulsoryStep1() {
        System.out.println("Compulsory step 1");
    }

    public void compulsoryStep2() {
        System.out.println("Compulsory step 2");
    }

    public abstract void optionalStep1();
    public abstract void optionalStep2();
    public abstract void optionalStep3();
    public abstract void optionalStep4();
}