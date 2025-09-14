package FactoryPattern;

public class SmsNotification implements Inotification{
    @Override
    public void createObj() {
        System.out.println("SMS Notification Trigger");
    }
}
