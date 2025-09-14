package FactoryPattern;

public class FactoryPatternD {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        notificationFactory.createNotificationObj("SMS").createObj();
    }
}
