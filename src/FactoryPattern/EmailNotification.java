package FactoryPattern;

public class EmailNotification implements Inotification{
    @Override
    public void createObj() {
        System.out.println("Email notification trigger");
    }
}
