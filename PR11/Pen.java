public class Pen extends WritingTool {
    private String penType;

    public Pen(String color, double price, String penType) {
        super(color, price);
        this.penType = penType;
    }

    public String getPenType() { return penType; }

    @Override
    public void writeSomething() {
        System.out.println("Ручка пише " + getColor() + " кольором.");
    }

    @Override
    public void leftWritingMaterial() {
        System.out.println("Залишок чорнила у ручці типу " + penType + ".");
    }

    /**
     * Замінює стрижень у ручці.
     */
    public void refillRod() {
        System.out.println("Стрижень у ручці замінено.");
    }
}
