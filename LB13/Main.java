import java.util.List;

public class Main {

    public static void runEmpty() {
        Student student = new Student();
        Teacher teacher = new Teacher();
        student.printInfo();
        teacher.printInfo();
    }

    public static void runWithArgs() {
        Student student = new Student("Дмитро", 20, "К-21");
        Teacher teacher = new Teacher("Олена Іванівна", 45, List.of("Java", "ООП", "Бази даних"));
        student.printInfo();
        teacher.printInfo();
    }

    public static void main(String[] args) {
        System.out.println("=== Порожні конструктори ===");
        runEmpty();

        System.out.println("\n=== Конструктори з аргументами ===");
        runWithArgs();
    }
}
