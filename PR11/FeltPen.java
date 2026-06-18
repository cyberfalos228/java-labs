public class FeltPen extends WritingTool {
    private boolean hasEraser;

    public FeltPen(String color, double price, boolean hasEraser) {
        super(color, price);
        this.hasEraser = hasEraser;
    }

    public boolean isHasEraser() { return hasEraser; }

    @Override
    public void writeSomething() {
        System.out.println("Фломастер пише " + getColor() + " кольором.");
    }

    @Override
    public void leftWritingMaterial() {
        System.out.println("Залишок чорнила у фломастері.");
    }

    /**
     * Пише на дошці.
     */
    public void writeSomethingOnBoard() {
        System.out.println("Фломастер пише на дошці.");
    }
}
