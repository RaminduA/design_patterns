public class ObserverMain {
    public static void main(String[] args) {
        PublisherImpl publisher = new PublisherImpl();
        Subscriber subscriber1 = new SubscriberImpl(publisher);
        Subscriber subscriber2 = new SubscriberImpl(publisher);

        publisher.notifySubscribers();
        publisher.setCost(10.0);
        publisher.setCost(20.0);
        publisher.unsubscribe(subscriber1);
        publisher.setCost(30);
        publisher.unsubscribe(subscriber2);
        publisher.setCost(40);
    }
}
