import java.awt.*;
import java.util.Random;

public class FlyweightMain {
    private static final Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.BLACK, Color.WHITE, Color.PINK, Color.ORANGE, Color.CYAN, Color.MAGENTA};

    public static void main(String[] args) {
        Random random = new Random();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            FlyweightContext context = new FlyweightContext(getRandColor(random.nextInt(10)), random.nextInt(100));
            context.operation();
        }

        long end = System.currentTimeMillis();

        System.out.println("Time Taken: " + (end - start) + "ms");
    }

    public static Color getRandColor(int i) {
        return colors[i];
    }
}
