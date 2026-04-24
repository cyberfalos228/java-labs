import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * Демонструє роботу системи співробітників.
     */
    public static void runEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Manager("Олег", 5000, 1000));
        employees.add(new Developer("Аня", 4000));
        employees.add(new Intern("Максим", 1000));

        System.out.println("=== Співробітники ===");
        for (Employee e : employees) {
            e.work();
            System.out.println("Зарплата: " + e.calculateSalary() + " грн");
        }
    }

    /**
     * Демонструє роботу системи повідомлень.
     */
    public static void runNotifications() {
        List<Notification> notifications = new ArrayList<>();
        notifications.add(new EmailNotification());
        notifications.add(new SMSNotification());
        notifications.add(new PushNotification());

        NotificationLogger logger = new NotificationLogger();
        String message = "Ваше замовлення підтверджено";

        System.out.println("\n=== Повідомлення ===");
        for (Notification n : notifications) {
            n.send(message);
        }
        logger.saveToFile(message);
    }

    public static void main(String[] args) {
        runEmployees();
        runNotifications();
    }
}
