public class PushNotification extends Notification {
    private String deviceId;

    public PushNotification(String message, String deviceId) {
        super(message);
        this.deviceId = deviceId;
    }

    @Override
    public void send() {
        System.out.println("[PUSH] Пристрій: " + deviceId + " | Повідомлення: " + message);
    }
}
