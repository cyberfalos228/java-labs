import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * Демонструє роботу з ручкою.
     */
    public static void runPen() {
        Pen pen = new Pen("синій", 15.0, "кулькова");
        pen.writeSomething();
        pen.leftWritingMaterial();
        pen.refillRod();
    }

    /**
     * Демонструє роботу з олівцем.
     */
    public static void runPencil() {
        Pencil pencil = new Pencil("чорний", 5.0, true);
        pencil.writeSomething();
        pencil.leftWritingMaterial();
        pencil.sharpAPencil();
    }

    /**
     * Демонструє роботу з фломастером.
     */
    public static void runFeltPen() {
        FeltPen feltPen = new FeltPen("червоний", 20.0, false);
        feltPen.writeSomething();
        feltPen.leftWritingMaterial();
        feltPen.writeSomethingOnBoard();
    }

    public static void main(String[] args) {
        List<WritingTool> tools = new ArrayList<>();
        tools.add(new Pen("синій", 15.0, "кулькова"));
        tools.add(new Pencil("чорний", 5.0, true));
        tools.add(new FeltPen("червоний", 20.0, false));

        System.out.println("=== Всі інструменти для письма ===");
        for (WritingTool tool : tools) {
            tool.writeSomething();
            tool.leftWritingMaterial();
            System.out.println();
        }

        System.out.println("=== Окремі методи ===");
        runPen();
        System.out.println();
        runPencil();
        System.out.println();
        runFeltPen();
    }
}
