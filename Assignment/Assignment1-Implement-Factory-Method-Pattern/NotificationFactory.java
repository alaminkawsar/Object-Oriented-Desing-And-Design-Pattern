public class NotificationFactory {
    public Notification createNotification(String notificationType){
        if(notificationType==null){
            return null;
        }else if(notificationType.equalsIgnoreCase("SMSNotification")){
            return new SMSNotification();
        }else if(notificationType.equalsIgnoreCase("PushNotification")){
            return new PushNotification();
        }else if(notificationType.equalsIgnoreCase("EmailNotification")){
            return new EmailNotification();
        }
        return null;
    }
}
