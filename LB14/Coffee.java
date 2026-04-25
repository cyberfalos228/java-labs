import java.util.List;

public class Coffee {
    private int basePrice;
    private List<Ingredient> ingredients;

    public Coffee(int basePrice, List<Ingredient> ingredients) {
        this.basePrice = basePrice;
        this.ingredients = ingredients;
    }

    /**
     * Готує каву та виводить усі інгредієнти і загальну ціну.
     */
    public void brewCoffee() {
        System.out.println("Готуємо каву...");
        System.out.println("Інгредієнти:");
        for (Ingredient ingredient : ingredients) {
            System.out.println("  - " + ingredient.getName() + " (" + ingredient.getPrice() + " грн)");
        }
        int totalPrice = basePrice + ingredients.stream().mapToInt(Ingredient::getPrice).sum();
        System.out.println("Загальна ціна: " + totalPrice + " грн");
    }

    public int getBasePrice() { return basePrice; }
    public List<Ingredient> getIngredients() { return ingredients; }
}
