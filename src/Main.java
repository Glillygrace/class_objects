class Lamp {
    boolean isOn;

    // method to turn on the light
    void turnOn() {
        isOn = true;
        System.out.println("Light on? " + isOn);

    }
    public static void main(String[] args) {

        // create an object of Lamp
        Lamp led = new Lamp();

        // access method using object
        led.turnOn();
    }
}