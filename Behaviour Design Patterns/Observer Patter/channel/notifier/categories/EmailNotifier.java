package channel.notifier.categories;

import channel.notifier.Notifier;
import channel.notifier.notification.Notification;

public class EmailNotifier implements Notifier {
    private class EmailNotification extends Notification {
        private String mailAddress;

        EmailNotification(String mailAddress, String messsage) {
            super(messsage); this.mailAddress = mailAddress;
        }

        public String getMailAddress() {
            return this.mailAddress;
        }
    }

    private static EmailNotifier notifier = null;

    private EmailNotifier() {
        System.out.println("Setting up SMTP...");
    }

    public static EmailNotifier getNotifier() {
        if (notifier == null) {
            synchronized (EmailNotifier.class) {
                if (notifier == null) {
                    notifier = new EmailNotifier();
                }
            }
        }

        return notifier;
    }

    @Override
    public void sendNotification(String message) {
        String mailAddress = null;
        // Set mailAddress by the user;

        EmailNotification notification = new EmailNotification(mailAddress, message);
        // Perform task on the notification

        System.out.println(notification.getMailAddress());
    }
}
