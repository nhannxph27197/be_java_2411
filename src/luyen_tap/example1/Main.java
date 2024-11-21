package luyen_tap.example1;

public class Main {
    public static void main(String[] args) {
        Lamp l1 = new Lamp();
        Lamp l2 = new Lamp();

        l1.turnOn();
        l2.turnOff();
        l1.displayLightStatus();
        l2.displayLightStatus();
    }
}
