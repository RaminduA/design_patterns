import java.awt.*;

public class FlyweightContext {
    private final Flyweight flyweight;
    private final int count;

    public FlyweightContext(Color color, int count) {
        this.count = count;
        this.flyweight = FlyweightFactory.getFlyweight(color);
    }

    public void operation() {
        flyweight.operation(count);
    }
}
