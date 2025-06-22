package channel.subscriber.categories;

import channel.notifier.Notifier;
import channel.notifier.categories.EmailNotifier;

import channel.subscriber.Subscriber;

public class RegularSubscriber implements Subscriber {
    @Override
    public void sendNotification() {
        Notifier notifier = EmailNotifier.getNotifier();
        notifier.sendNotification("Informed using Email");
    }
}
