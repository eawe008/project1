package EcoTransport.Models;

public class EcoTransportTester {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle("John" , "Bicycle" , "Goodyear", true, 12);

        System.out.println(bike1);

        ElectricCar car1 = new ElectricCar("Kimberly" , "Car", "0001hy7" . 340, 600);
        System.out.println(car1);

        ElectricScooter scoot1 = new ElectricScooter("Beck", "Scooter",  "009io900",25, 250);
    }


}
