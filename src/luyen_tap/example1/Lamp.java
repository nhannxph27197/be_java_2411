package luyen_tap.example1;

public class Lamp {
    boolean isOn;

    void  turnOn(){
        isOn = true;
    }

    void  turnOff(){
        isOn = false;
    }

    void displayLightStatus() {
        System.out.println("light on? " + isOn);
    }
}
