public class SubscriberImpl implements Subscriber {
    private static int subscriberCount = 0;
    private final int id;

    public SubscriberImpl(Publisher publisher) {
        this.id = ++subscriberCount;
        publisher.subscribe(this);
    }

    @Override
    public void update(double cost) {
        System.out.println("Subscriber " + id + " notified: " + cost);
    }
}
