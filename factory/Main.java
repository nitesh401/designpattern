package factory;

public class Main {
    public static void main(String[] args) {
        // Example: Sending SMS notification
        Notification sms = NotificationFactory.createNotification("SMS");
        sms.notifyUser();

        // Example: Sending Email notification
        Notification email = NotificationFactory.createNotification("Email");
        email.notifyUser();

        // Example: Sending Push notification
        Notification push = NotificationFactory.createNotification("Push");
        push.notifyUser();
    }
}

