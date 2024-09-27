public class Builder2 implements Builder {
    private Product product = new Product2();

    @Override
    public Builder buildStep1() {
        product.setFeature1("Builder2: Feature 1 assembled");
        System.out.println(product.getFeature1());
        return this;
    }

    @Override
    public Builder buildStep2() {
        product.setFeature2("Builder2: Feature 2 assembled");
        System.out.println(product.getFeature2());
        return this;
    }

    @Override
    public Builder buildStep3() {
        product.setFeature3("Builder2: Feature 3 assembled");
        System.out.println(product.getFeature3());
        return this;
    }

    @Override
    public void reset() {
        product = new Product2();
    }

    @Override
    public Product getResult() {
        return product;
    }
}
