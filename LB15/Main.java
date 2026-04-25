public class Main {

    /**
     * Демонструє коректний запис особи.
     */
    public static void runValid() {
        InsuranceService service = new InsuranceService();
        Person person = new Person("Дмитро", 20, 2004, 5, 15, "вул. Миру, 12", 8500.0, "123-45-6789");
        try {
            service.save(person);
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }

    /**
     * Демонструє виняток при null імені.
     */
    public static void runNullName() {
        InsuranceService service = new InsuranceService();
        Person person = new Person(null, 20, 2004, 5, 15, "вул. Миру, 12", 8500.0, "123-45-6789");
        try {
            service.save(person);
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }

    /**
     * Демонструє виняток при некоректній зарплатні.
     */
    public static void runInvalidSalary() {
        InsuranceService service = new InsuranceService();
        Person person = new Person("Дмитро", 20, 2004, 5, 15, "вул. Миру, 12", -100.0, "123-45-6789");
        try {
            service.save(person);
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }

    /**
     * Демонструє виняток при некоректній даті.
     */
    public static void runInvalidDate() {
        InsuranceService service = new InsuranceService();
        Person person = new Person("Дмитро", 20, 2004, 13, 15, "вул. Миру, 12", 8500.0, "123-45-6789");
        try {
            service.save(person);
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Коректний запис ===");
        runValid();

        System.out.println("\n=== Null ім'я ===");
        runNullName();

        System.out.println("\n=== Некоректна зарплатня ===");
        runInvalidSalary();

        System.out.println("\n=== Некоректна дата ===");
        runInvalidDate();
    }
}
