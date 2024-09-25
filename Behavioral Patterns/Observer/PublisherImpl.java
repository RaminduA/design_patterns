import java.util.ArrayList;
import java.util.List;

public class PublisherImpl implements Publisher {
    private final List<Subscriber> subscribers = new ArrayList<>();
    private double cost;

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(cost);
        }
    }


    public void setCost(double cost) {
        this.cost = cost;
        notifySubscribers();
    }
}
