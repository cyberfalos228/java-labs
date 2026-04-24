public class Main {

    /**
     * Демонструє роботу базових компонентів.
     */
    public static void runBasicComponents() {
        SoundPlayer alarm = new Alarm();
        DoorController door = new AutoDoor();
        MotionDetector motion = new MotionSensor();
        SmokeDetector smoke = new SmokeSensor();

        alarm.playSound();
        door.openDoor();
        motion.detectMove();
        smoke.detectSmoke();
    }

    /**
     * Демонструє роботу розширеного датчика диму.
     */
    public static void runAdvancedSensor() {
        AdvancedSmokeSensor advanced = new AdvancedSmokeSensor(0.2);
        advanced.isCritical();
    }

    public static void main(String[] args) {
        System.out.println("=== Базові компоненти ===");
        runBasicComponents();

        System.out.println("\n=== Розширений датчик диму ===");
        runAdvancedSensor();
    }
}
