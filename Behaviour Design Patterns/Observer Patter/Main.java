import channel.Channel;

import channel.subscriber.categories.RegularSubscriber;
import channel.subscriber.categories.SpecialSubscriber;

public class Main {
    public static void main(String[] args) {
        Channel channel = new Channel();

        channel.addSubscriber(new RegularSubscriber());
        channel.addSubscriber(new RegularSubscriber());

        channel.notifySubscribers();

        channel.addSubscriber(new SpecialSubscriber());

        channel.notifySubscribers();
    }
}