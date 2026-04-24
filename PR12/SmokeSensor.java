public class SmokeSensor implements SmokeDetector {
    @Override
    public double detectSmoke() {
        double level = 0.3;
        System.out.println("Датчик диму: рівень = " + level);
        return level;
    }
}
