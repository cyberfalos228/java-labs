import java.util.*;
import java.util.stream.*;

public class Main {

    /**
     * Завдання 1: Студенти старші за 20 років.
     */
    public static void task1() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Дмитро", 20));
        students.add(new Student("Аня", 22));
        students.add(new Student("Олег", 19));
        students.add(new Student("Марія", 21));
        students.add(new Student("Іван", 18));

        List<Student> result = students.stream()
            .filter(s -> s.getAge() > 20)
            .collect(Collectors.toList());

        System.out.println("Завдання 1 (вік > 20):");
        result.forEach(s -> System.out.println("  " + s));
    }

    /**
     * Завдання 2: Кількість унікальних рядків.
     */
    public static void task2() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(
            "яблуко", "банан", "яблуко", "вишня", "банан", "ківі", "вишня"
        ));

        long count = list.stream()
            .distinct()
            .count();

        System.out.println("Завдання 2 (унікальних рядків): " + count);
    }

    /**
     * Завдання 3: Сума квадратів парних чисел.
     */
    public static void task3() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        int sum = numbers.stream()
            .filter(n -> n % 2 == 0)
            .mapToInt(n -> n * n)
            .sum();

        System.out.println("Завдання 3 (сума квадратів парних): " + sum);
    }

    /**
     * Завдання 4: Перетворення списку Employee на Map<id, Employee>.
     */
    public static void task4() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Дмитро", 1L, 8500.0));
        employees.add(new Employee("Аня", 2L, 7200.0));
        employees.add(new Employee("Олег", 3L, 9100.0));
        employees.add(new Employee("Марія", 4L, 6800.0));

        Map<Long, Employee> map = employees.stream()
            .collect(Collectors.toMap(Employee::getId, e -> e));

        System.out.println("Завдання 4 (Map id -> Employee):");
        map.forEach((id, e) -> System.out.println("  ID " + id + ": " + e));
    }

    /**
     * Завдання 5: Студент з максимальною оцінкою з груп 529 та 529ст.
     */
    public static void task5() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Дмитро", "519", 4.2));
        students.add(new Student("Аня", "519", 4.8));
        students.add(new Student("Олег", "529", 3.9));
        students.add(new Student("Марія", "529", 4.7));
        students.add(new Student("Іван", "529ст", 4.5));
        students.add(new Student("Катя", "529ст", 4.9));
        students.add(new Student("Тарас", "525", 3.7));
        students.add(new Student("Ліна", "525", 4.1));
        students.add(new Student("Богдан", "526", 4.3));
        students.add(new Student("Оля", "526", 3.5));

        Optional<Student> result = students.stream()
            .filter(s -> s.getGroup().equals("529") || s.getGroup().equals("529ст"))
            .max(Comparator.comparingDouble(Student::getAvrGrade));

        result.ifPresent(s -> System.out.println("Завдання 5 (макс. оцінка з 529/529ст): "
            + s.getName() + " | група: " + s.getGroup() + " | оцінка: " + s.getAvrGrade()));
    }

    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
    }
}
