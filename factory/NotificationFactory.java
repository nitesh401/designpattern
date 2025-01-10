package factory;

class NotificationFactory {
    public static Notification createNotification(String type) {
        if (type.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        } else if (type.equalsIgnoreCase("Email")) {
            return new EmailNotification();
        } else if (type.equalsIgnoreCase("Push")) {
            return new PushNotification();
        }
        throw new IllegalArgumentException("Unknown notification type: " + type);
    }
}
