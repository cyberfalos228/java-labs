public abstract class WritingTool {
    private String color;
    private double price;

    public WritingTool(String color, double price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() { return color; }
    public double getPrice() { return price; }

    /**
     * Пише текст.
     */
    public abstract void writeSomething();

    /**
     * Повертає залишок матеріалу для письма.
     */
    public abstract void leftWritingMaterial();
}
