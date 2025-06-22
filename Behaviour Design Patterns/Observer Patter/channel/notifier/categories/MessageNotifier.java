package channel.notifier.categories;

import channel.notifier.Notifier;
import channel.notifier.notification.Notification;

public class MessageNotifier implements Notifier {
    private class MessageNotification extends Notification {
        private String contactNumber;

        MessageNotification(String contactNumber, String messsage) {
            super(messsage); this.contactNumber = contactNumber;
        }

        public String getContactNumber() {
            return this.contactNumber;
        }
    }

    private static MessageNotifier notifier = null;

    private MessageNotifier() {
        System.out.println("Setting up Message Protocol...");
    }

    public static MessageNotifier getNotifier() {
        if (notifier == null) {
            synchronized (MessageNotifier.class) {
                if (notifier == null) {
                    notifier = new MessageNotifier();
                }
            }
        }

        return notifier;
    }

    @Override
    public void sendNotification(String message) {
        String contactNumber = null;
        // Set mailAddress by the user;

        MessageNotification notification = new MessageNotification(contactNumber, message);
        // Perform task on the notification

        System.out.println(notification.getContactNumber());
    }
}
