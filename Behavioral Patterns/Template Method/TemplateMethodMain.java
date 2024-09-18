public class TemplateMethodMain {
    public static void main(String[] args) {
        Template variantA = new VariantA();
        variantA.templateMethod();

        Template variantB = new VariantB();
        variantB.templateMethod();

        Template variantC = new VariantC();
        variantC.templateMethod();
    }
}
