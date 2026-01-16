package Exam2;

public class NotificationFactory {

    public static NotificationService getBean(String channel) {

        channel = channel.toUpperCase();
        return switch (channel) {
            case "SMS" -> new SMSNotification();
            case "EMAIL" -> new EmailNotification();
            default -> null;
        };
    }

}
