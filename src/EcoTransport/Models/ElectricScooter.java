package EcoTransport.Models;

public class ElectricScooter extends BaseVehicle{

    private int maxSpeed;
    private double weightCapacity;

    public ElectricScooter(String ownerName, String vehicleType, String registrationNumber, int maxSpeed, double weightCapacity) {
        super(ownerName, vehicleType, registrationNumber);
        this.maxSpeed = maxSpeed;
        this.weightCapacity = weightCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(double weightCapacity) {
        this.weightCapacity = weightCapacity;
    }

    @Override
    public String toString(){
        return super.toString() + "\n Max Speed: " + getMaxSpeed() + "km/h" +
                "\nWeight Capacity: " + getWeightCapacity() + "kg";
    }
}
