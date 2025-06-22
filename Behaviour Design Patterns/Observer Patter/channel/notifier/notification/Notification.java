package channel.notifier.notification;

public abstract class Notification {
    private String message;

    protected Notification(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}