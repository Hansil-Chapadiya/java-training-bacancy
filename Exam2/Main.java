package Exam2;

public class Main {
    public static void main(String[] args) {

        // NotificationService email = new EmailNotification();
        // email.sendNotification("Hello , This mail from Hansil\n");

        NotificationService email = NotificationFactory.getBean("EMAIL");
        email.sendNotification("Hello , This mail from Hansil\n");

        // NotificationService sms = new SMSNotification();
        // sms.sendNotification("Hello, This text message from Hansil\n");

        NotificationService sms = NotificationFactory.getBean("SMS");
        sms.sendNotification("This text message from Hansil\n");

    }
}
