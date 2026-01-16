package Exam2;

public class EmailNotification implements NotificationService {

    @Override
    public void sendNotification(String message) {

        System.out.println("Mail sent successfully");
        System.out.println("Mail Content = " + message);

    }

}
