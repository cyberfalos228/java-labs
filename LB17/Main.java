import java.util.Arrays;
import java.util.List;

public class Main {

    /**
     * Демонструє роботу класу Box з різними типами.
     */
    public static void runBox() {
        Box<String> stringBox = new Box<>("Привіт");
        Box<Integer> intBox = new Box<>(42);
        Box<Double> doubleBox = new Box<>(3.14);

        System.out.println("Завдання 1 - Box:");
        System.out.println("  " + stringBox);
        System.out.println("  " + intBox);
        System.out.println("  " + doubleBox);
    }

    /**
     * Демонструє роботу класу Searcher з різними типами.
     */
    public static void runSearcher() {
        Searcher<String> stringSearcher = new Searcher<>();
        List<String> names = Arrays.asList("Дмитро", "Аня", "Олег", "Марія");
        System.out.println("Завдання 2 - Searcher:");
        System.out.println("  Містить 'Аня': " + stringSearcher.contains(names, "Аня"));
        System.out.println("  Містить 'Іван': " + stringSearcher.contains(names, "Іван"));

        Searcher<Integer> intSearcher = new Searcher<>();
        List<Integer> numbers = Arrays.asList(10, 25, 42, 78, 99);
        System.out.println("  Містить 42: " + intSearcher.contains(numbers, 42));
        System.out.println("  Містить 50: " + intSearcher.contains(numbers, 50));
    }

    public static void main(String[] args) {
        runBox();
        System.out.println();
        runSearcher();
    }
}
