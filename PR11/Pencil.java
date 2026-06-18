public class Pencil extends WritingTool {
    private boolean hasEraser;

    public Pencil(String color, double price, boolean hasEraser) {
        super(color, price);
        this.hasEraser = hasEraser;
    }

    public boolean isHasEraser() { return hasEraser; }

    @Override
    public void writeSomething() {
        System.out.println("Олівець пише " + getColor() + " кольором.");
    }

    @Override
    public void leftWritingMaterial() {
        System.out.println("Залишок грифеля в олівці.");
    }

    /**
     * Точить олівець.
     */
    public void sharpAPencil() {
        System.out.println("Олівець заточено.");
    }
}
