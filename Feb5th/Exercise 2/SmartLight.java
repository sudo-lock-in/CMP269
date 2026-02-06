public class SmartLight extends SmartDevice implements Adjustable{
    private int brightness;

    public SmartLight(String deviceName) {
        super(deviceName);
    }

    @Override
    public void performSelfDiagnostic() {
        System.out.println("Checking LED health...");
    }

    @Override
    public void turnOff() {
        if (isOn) {
            isOn = false;
            activeDevicesCount--;
        }
    }   

    @Override
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            activeDevicesCount++;
        }
    }

    @Override
    public void setLevel(int level) {
        if (!isOn) {
            System.out.println("Cannot adjust: Device is OFF.");
        } else {
            if (level < 0 || level > 100) {
                throw new IllegalArgumentException("Brightness level must be between 0 and 100.");
            }
            this.brightness = level;
        }
    }
}

    








