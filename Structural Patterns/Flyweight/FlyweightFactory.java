import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static final Map<Color, Flyweight> cache = new HashMap<>();

    public static Flyweight getFlyweight(Color color) {
        if (!cache.containsKey(color)) {
            cache.put(color, new Flyweight(color));
        }
        return cache.get(color);
    }
}
