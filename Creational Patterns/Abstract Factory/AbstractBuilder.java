public abstract class AbstractBuilder {
    protected abstract AbstractProduct make(AbstractFactoryType type);

    public AbstractProduct order(AbstractFactoryType type) {
        AbstractProduct product = make(type);
        product.create();
        product.doThis();
        product.doThat();
        return product;
    }
}
