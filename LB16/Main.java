import java.util.*;

public class Main {

    /**
     * Завдання 1: ArrayList з 5 елементів, вивід через for-each.
     */
    public static void task1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Яблуко");
        list.add("Банан");
        list.add("Вишня");
        list.add("Диня");
        list.add("Ківі");

        System.out.println("Завдання 1:");
        for (String item : list) {
            System.out.println("  " + item);
        }
    }

    /**
     * Завдання 2: HashSet з цілих чисел, перевірка наявності 42.
     */
    public static void task2() {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(25);
        set.add(42);
        set.add(78);
        set.add(99);

        System.out.println("Завдання 2:");
        System.out.println("  Містить 42: " + set.contains(42));
        System.out.println("  Містить 50: " + set.contains(50));
    }

    /**
     * Завдання 3: HashMap ім'я-вік, вивід усіх пар.
     */
    public static void task3() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Дмитро", 20);
        map.put("Аня", 21);
        map.put("Олег", 19);
        map.put("Марія", 22);

        System.out.println("Завдання 3:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("  " + entry.getKey() + " - " + entry.getValue() + " років");
        }
    }

    /**
     * Завдання 4: Видалення елемента з ArrayList за індексом.
     */
    public static void task4() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Яблуко");
        list.add("Банан");
        list.add("Вишня");
        list.add("Диня");
        list.add("Ківі");

        list.remove(2);

        System.out.println("Завдання 4 (видалено індекс 2):");
        for (String item : list) {
            System.out.println("  " + item);
        }
    }

    /**
     * Завдання 5: Мінімальне та максимальне значення у ArrayList.
     */
    public static void task5() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(3);
        numbers.add(87);
        numbers.add(42);
        numbers.add(9);

        System.out.println("Завдання 5:");
        System.out.println("  Мінімум: " + Collections.min(numbers));
        System.out.println("  Максимум: " + Collections.max(numbers));
    }

    /**
     * Завдання 6: ArrayList рядків, сортування за алфавітом.
     */
    public static void task6() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Банан");
        list.add("Яблуко");
        list.add("Ківі");
        list.add("Вишня");
        list.add("Диня");

        Collections.sort(list);

        System.out.println("Завдання 6 (алфавітний порядок):");
        for (String item : list) {
            System.out.println("  " + item);
        }
    }

    /**
     * Завдання 7: Об'єднання двох HashSet.
     */
    public static void task7() {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println("Завдання 7 (об'єднання):");
        System.out.println("  " + union);
    }

    /**
     * Завдання 8: ArrayList з Book, сортування за title та publishingYear.
     */
    public static void task8() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Кобзар", 1840));
        books.add(new Book("Майстер і Маргарита", 1967));
        books.add(new Book("Гаррі Поттер", 1997));
        books.add(new Book("Дюна", 1965));
        books.add(new Book("Андроїд", 1968));

        books.sort(Comparator.comparing(Book::getTitle));
        System.out.println("Завдання 8 (за назвою):");
        for (Book book : books) {
            System.out.println("  " + book);
        }

        books.sort(Comparator.comparingInt(Book::getPublishingYear));
        System.out.println("Завдання 8 (за роком):");
        for (Book book : books) {
            System.out.println("  " + book);
        }
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
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();
        task8();
    }
}
