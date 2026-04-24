public class AdvancedSmokeSensor extends SmokeSensor {
    private double threshold;

    public AdvancedSmokeSensor(double threshold) {
        this.threshold = threshold;
    }

    /**
     * Перевіряє чи перевищено допустимий рівень диму.
     */
    public boolean isCritical() {
        double level = detectSmoke();
        boolean critical = level > threshold;
        System.out.println("Критичний рівень: " + critical);
        return critical;
    }
}
