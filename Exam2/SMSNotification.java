package Exam2;

public class SMSNotification implements NotificationService {

    @Override
    public void sendNotification(String message) {

        System.out.println("Message sent successfully");
        System.out.println("Message Content = " + message);

    }
}
