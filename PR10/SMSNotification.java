public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Відправка SMS: " + message);
    }
}
