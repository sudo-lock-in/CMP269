import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<SmartDevice> homeHub = new ArrayList<>();
        SmartLight livingRoomLight = new SmartLight("Living Room Light");
        SmartLight kitchenLight = new SmartLight("Kitchen Light");
        SmartThermostat hallwayThermostat = new SmartThermostat("Hallway Thermostat");
        homeHub.add(livingRoomLight);
        homeHub.add(kitchenLight);
        homeHub.add(hallwayThermostat);

        //logic test
        homeHub.get(0).turnOn();
        homeHub.get(2).turnOn();
        kitchenLight.setLevel(75);
        System.out.println("Active devices: " + SmartDevice.getActiveDevicesCount());

    }
}
