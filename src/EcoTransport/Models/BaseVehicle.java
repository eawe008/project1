package EcoTransport.Models;

/**
 * class: BaseVehicle
 * @author: Ewura Ama Awere
 * @version: 1.0
 * @written on: Feb. 19th, 2024
 * course: ITEC 2150 - Spring 2024
 * description: The superclass BaseVehicle in the package EcoTransport.Models that determines the behavior of
 * the three subclasses Bicycle, ElectricCar, and ElectricScooter.
 * They each contain constructors, getters, setters, and toString methods.
 * The toString methods in the subclasses override the one in the superclass,
 * adding specifications unique to each different method of transportation.
 */
public class BaseVehicle {
    protected String ownerName;
    protected String vehicleType;
    protected String registrationNumber;

    public BaseVehicle(String ownerName, String vehicleType, String registrationNumber){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString(){
        return "Owner Name: " + getOwnerName() +
                "\nVehicle Type: " + getVehicleType() +
                "\nRegistration Number: " + getRegistrationNumber();
    }
}
