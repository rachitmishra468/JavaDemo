package FactoryPattern;

public class NotificationFactory {
    public static Inotification createNotificationObj(String type){
        if(type.equals("Email")){
            return new EmailNotification();
        }else if(type.equals("SMS")) {
            return new SmsNotification();
        }
        return null;
    }
}
