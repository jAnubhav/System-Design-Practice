package channel;

import java.util.List;
import java.util.ArrayList;

import channel.subscriber.Subscriber;

public class Channel {
    private List<Subscriber> subscribers;

    public Channel() {
        this.subscribers = new ArrayList<>();
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.sendNotification();
        }
    }
}
