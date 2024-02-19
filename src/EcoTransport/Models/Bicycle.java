package EcoTransport.Models;

public class Bicycle extends BaseVehicle{

    private boolean hasGears;
    private int gearCount;

    public Bicycle(String ownerName, String vehicleType, String registrationNumber, boolean hasGears, int gearCount) {
        super(ownerName, vehicleType, registrationNumber);
        this.hasGears = hasGears;
        this.gearCount = gearCount;
    }

    public boolean isHasGears() {
        return hasGears;
    }

    public void setHasGears(boolean hasGears) {
        this.hasGears = hasGears;
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    @Override
    public String toString(){
        return super.toString() + "\nHas Gears?: " + isHasGears() +

                "\nNumber of Gears: " + getGearCount();
    }
}
