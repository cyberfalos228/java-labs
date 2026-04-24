public class MotionSensor implements MotionDetector {
    @Override
    public boolean detectMove() {
        System.out.println("Датчик руху: рух виявлено.");
        return true;
    }
}
