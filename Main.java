public class Main {
  
    public static void task1(String s) {
        char last = s.charAt(s.length() - 1);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == last) {
                if (result.length() > 0) result.append(", ");
                result.append(i);
            }
        }
        System.out.println("Завдання 1: " + result);
    }

    public static void task2(String s) {
        long count = s.chars().filter(Character::isDigit).count();
        System.out.println("Завдання 2: " + count);
    }

    public static void task3(String s) {
        long count = s.chars().filter(c -> c >= '1' && c <= '5').count();
        System.out.println("Завдання 3: " + count);
    }

    public static void task4(String s) {
        String result = s.replaceAll("abbbbbbbbbbbbbc(?=\\d)", "");
        System.out.println("Завдання 4: " + result);
    }

    public static void task5(String s) {
        int sum = s.chars().filter(Character::isDigit).map(c -> c - '0').sum();
        System.out.println("Завдання 5: " + sum);
    }

    public static void main(String[] args) {
        String s1 = "abc123a6bc4ab5ca88b9c";
        String s4 = "abc123aabbbbbbbbbbbbbc6bc4ab5ca88babbbbbbbbbbbbbc9c";

        task1(s1);
        task2(s1);
        task3(s1);
        task4(s4);
        task5(s1);
    }
}
