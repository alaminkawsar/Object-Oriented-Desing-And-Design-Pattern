public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification smsNotification = factory.createNotification("SMSNotification");
        Notification emailNotification = factory.createNotification("EmailNotification");
        Notification pushNotification = factory.createNotification("PushNotification");

        smsNotification.notifyUser();
        emailNotification.notifyUser();
        pushNotification.notifyUser();

    }
}

/*Output Should be looks like:*/
/*

User-Notification-SMS-Notification
User-Notification-Email
User-Push-Notification

 */
