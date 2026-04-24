public class Main {
    public static void main(String[] args) {
        int[] array = {3, -5, -2, 4, -8, 0};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && array[i] % 2 == 0) {
                sum += array[i];
            }
        }

        System.out.println("Масив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Сума парних від'ємних елементів: " + sum);
    }
}
