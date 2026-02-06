public class SmartThermostat extends SmartDevice implements Adjustable {
    private int temperature;

    public SmartThermostat(String deviceName) {
        super(deviceName);
    }

    

    @Override
    public void setLevel(int level) {
        if (!isOn) {
            System.out.println("Cannot adjust: Device is OFF.");
        } else {
            if (level < 60 || level > 80) {
                throw new IllegalArgumentException("Temperature level must be between 60 and 80.");
            }
            this.temperature = level;
        }
    }

    @Override
    public void performSelfDiagnostic() { //i need to implement this method because it is abstract in the parent class
        System.out.println("Checking temperature sensor...");
    }

    //i cannot call super.turnOn() or super.turnOff() because those methods are not implemented in the parent class, 
    // they are abstract. i have to implement them in this class.
    @Override
    public void turnOff() {
        if (isOn) {
            isOn = false;
            removeActiveDevice();
        }
    }   

    @Override
    public void turnOn() {
        System.out.println("HVAC System Starting...");
        if (!isOn) {
            isOn = true;
            addActiveDevice();
        }
    }



}
