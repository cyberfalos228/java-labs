import java.util.*;
import java.util.stream.*;

public class Main {

    /**
     * Завдання 1: Фільтрація парних чисел та сортування.
     */
    public static void task1() {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 2, 9, 4, 7, 6, 1, 10);

        List<Integer> result = numbers.stream()
            .filter(n -> n % 2 == 0)
            .sorted()
            .collect(Collectors.toList());

        System.out.println("Завдання 1: " + result);
    }

    /**
     * Завдання 2: Сума квадратів усіх елементів.
     */
    public static void task2() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
            .mapToInt(n -> n * n)
            .sum();

        System.out.println("Завдання 2: " + sum);
    }

    /**
     * Завдання 3: Перший рядок що починається на літеру А.
     */
    public static void task3() {
        List<String> words = Arrays.asList("Банан", "Апельсин", "Вишня", "Абрикос", "Диня");

        Optional<String> result = words.stream()
            .filter(w -> w.startsWith("А"))
            .findFirst();

        System.out.println("Завдання 3: " + result.orElse("Не знайдено"));
    }

    /**
     * Завдання 4: Унікальні слова зі списку.
     */
    public static void task4() {
        List<String> words = Arrays.asList("яблуко", "банан", "яблуко", "вишня", "банан", "ківі");

        List<String> result = words.stream()
            .distinct()
            .collect(Collectors.toList());

        System.out.println("Завдання 4: " + result);
    }

    /**
     * Завдання 5: Групування рядків за довжиною.
     */
    public static void task5() {
        List<String> words = Arrays.asList("кіт", "слон", "пес", "лев", "тигр", "жираф", "вовк");

        Map<Integer, List<String>> result = words.stream()
            .collect(Collectors.groupingBy(String::length));

        System.out.println("Завдання 5:");
        result.forEach((len, list) ->
            System.out.println("  Довжина " + len + ": " + list));
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
}
