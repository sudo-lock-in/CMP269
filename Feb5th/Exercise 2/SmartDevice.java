public abstract class SmartDevice implements Powerable{
    protected String deviceName;
    protected boolean isOn;

    public SmartDevice(String deviceName){
        this.deviceName = deviceName;
        isOn = false;
    }

    private static int activeDevices = 0;
    abstract void performSelfDiagnostic();


}
