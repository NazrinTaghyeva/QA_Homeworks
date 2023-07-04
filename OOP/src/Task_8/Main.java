package Task_8;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
               --------------------------- Rental Transaction ----------------------------
                """);
        RentalTransaction rentalTransaction = new RentalTransaction(
                new LuxuryCar("Smt", "Luxury Car", 2020, 55, false),
                "John",
                30
        );
        rentalTransaction.calculateRentalCost();
        double rentTransact = rentalTransaction.calculateRentalCost();
        String infoRentTansact = rentalTransaction.displayTransactionInfo();
        String customerName = rentalTransaction.getCustomerName();
        int rentalDays = rentalTransaction.getRentalDays();
        System.out.println("Customer Name: "+ customerName);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Display Info: " + infoRentTansact);
        System.out.println("Rent Transaction: " + rentTransact);

        System.out.println("-------------------------------Economy Car-------------------------------------------------");

        EconomyCar economyCar = new EconomyCar("Smt", "Economy Car", 2022, 75, false, 500.30);
        double fuel = economyCar.getFuelEfficiency();
        System.out.println("Economy Car Fuel:"+fuel);
        System.out.println(economyCar.displayCarInfo());
        System.out.println(economyCar.calculateRentalCharge(40));
        System.out.println(economyCar.returnCar());
        economyCar.rent(50);

        System.out.println("-------------------------------Luxury Car-------------------------------------------------");
        LuxuryCar luxuryCar = new LuxuryCar("Smt", "Economy Car", 2022, 75, false);
        System.out.println("Luxury Car Rental Charge: " + luxuryCar.calculateRentalCharge(80));
        System.out.println(luxuryCar.displayCarInfo());
        System.out.println(luxuryCar.calculateRentalCharge(50));
        System.out.println(luxuryCar.returnCar());
        LuxuryCar luxuryCar2 = new LuxuryCar("Smt", "Economy Car", 2022, 75, false,new String[]{"High Speed","Color is expensive"});
        String[] premiumFeatures = luxuryCar2.getPremiumFeatures();
        for (int i = 0; i < premiumFeatures.length; i++) {
            String pF = premiumFeatures[i];
            System.out.println("Luxury Car-->Premium Features(" + (i + 1) + ") " + pF);
        }

        System.out.println("---------------------------------------------------------------------------------");


        Car cars[] = {
                new LuxuryCar("Smt", "Luxury Car", 2020, 55, false),
                new EconomyCar("Smt", "Economy Car", 2022, 75, true, 500.30)
        };
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            System.out.println(car.displayCarInfo());
        }



    }
}