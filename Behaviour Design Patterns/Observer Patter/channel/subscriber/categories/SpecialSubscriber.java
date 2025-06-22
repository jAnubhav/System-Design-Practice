package channel.subscriber.categories;

import channel.notifier.Notifier;
import channel.notifier.categories.EmailNotifier;
import channel.notifier.categories.MessageNotifier;

import channel.subscriber.Subscriber;

public class SpecialSubscriber implements Subscriber {
    @Override
    public void sendNotification() {
        Notifier notifier = EmailNotifier.getNotifier();
        notifier.sendNotification("Informed using Email");

        notifier = MessageNotifier.getNotifier();
        notifier.sendNotification("Informed using Message");
    }
}
