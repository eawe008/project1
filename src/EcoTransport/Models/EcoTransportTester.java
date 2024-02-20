package EcoTransport.Models;

public class EcoTransportTester {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle("John" , "Bicycle" , "878YHUB5", true, 12);

        System.out.println(bike1);

        ElectricCar car1 = new ElectricCar("Kimberly" , "Car", "000DTG" , 340, 600);
        System.out.println(car1);

        ElectricScooter scoot1 = new ElectricScooter("Beck", "Scooter","00CYT900",25, 250);
        System.out.println(scoot1);
    }


}
