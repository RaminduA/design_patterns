import java.awt.*;

public class Flyweight {
    private final Color color;

    public Flyweight(Color color) {
        this.color = color;
    }

    public void operation(int count) {
        System.out.println("Flyweight operation with color: " + color + " and count: " + count);
    }
}
