import java.util.List;

public class Main {

    /**
     * Демонструє приготування простої кави.
     */
    public static void runSimpleCoffee() {
        Coffee coffee = new Coffee(30, List.of());
        System.out.println("=== Проста кава ===");
        coffee.brewCoffee();
    }
  
    /**
     * Демонструє приготування кави з молоком.
     */
    public static void runCoffeeWithMilk() {
        Coffee coffee = new Coffee(30, List.of(
            new Ingredient("Молоко", 10)
        ));
        System.out.println("=== Кава з молоком ===");
        coffee.brewCoffee();
    }

    /**
     * Демонструє приготування кави з шоколадом.
     */
    public static void runCoffeeWithChocolate() {
        Coffee coffee = new Coffee(30, List.of(
            new Ingredient("Шоколад", 15)
        ));
        System.out.println("=== Кава з шоколадом ===");
        coffee.brewCoffee();
    }

    /**
     * Демонструє приготування кави з молоком та шоколадом.
     */
    public static void runCoffeeWithMilkAndChocolate() {
        Coffee coffee = new Coffee(30, List.of(
            new Ingredient("Молоко", 10),
            new Ingredient("Шоколад", 15)
        ));
        System.out.println("=== Кава з молоком та шоколадом ===");
        coffee.brewCoffee();
    }

    public static void main(String[] args) {
        runSimpleCoffee();
        System.out.println();
        runCoffeeWithMilk();
        System.out.println();
        runCoffeeWithChocolate();
        System.out.println();
        runCoffeeWithMilkAndChocolate();
    }
}
