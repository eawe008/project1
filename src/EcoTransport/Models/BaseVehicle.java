package EcoTransport.Models;

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
