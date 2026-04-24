import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * Демонструє роботу з геометричними фігурами.
     */
    public static void runShapes() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));
        shapes.add(new Triangle(3, 4, 5));

        System.out.println("=== Геометричні фігури ===");
        for (Shape shape : shapes) {
            System.out.printf("%s | Площа: %.2f | Периметр: %.2f%n",
                shape.getClass().getSimpleName(), shape.area(), shape.perimeter());
        }
    }

    /**
     * Демонструє відправку повідомлень різних типів.
     */
    public static void runNotifications() {
        List<Notification> notifications = new ArrayList<>();
        notifications.add(new EmailNotification("Ваш акаунт підтверджено", "user@example.com"));
        notifications.add(new SMSNotification("Код підтвердження: 4892", "+380991234567"));
        notifications.add(new PushNotification("У вас нове повідомлення", "device-abc-123"));

        System.out.println("\n=== Повідомлення ===");
        for (Notification notification : notifications) {
            notification.send();
        }
    }

    public static void main(String[] args) {
        runShapes();
        runNotifications();
    }
}
