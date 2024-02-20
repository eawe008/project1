package EcoTransport.Models;

public class ElectricCar extends BaseVehicle{

    private int batteryCapacity;
    private int range;

    public ElectricCar(String ownerName, String vehicleType, String registrationNumber, int batteryCapacity, int range) {
        super(ownerName, vehicleType, registrationNumber);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public String toString(){
        return super.toString() + "\nBattery Capacity: " + getBatteryCapacity() + "kWh" +
                "\nRange: " + getRange() + "km" +
                "\n\n";
    }
}
