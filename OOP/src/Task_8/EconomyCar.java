package Task_8;

public class EconomyCar extends Car{
    private double fuelEfficiency;

    public EconomyCar(String make, String model, int year, double rentalRate, boolean isAviable,double fuelEfficiency) {
        super(make, model, year, rentalRate, isAviable);
        this.fuelEfficiency =fuelEfficiency;
    }


    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public double calculateRentalCharge(int numOfDays) {
        return  getRentalRate() * numOfDays * 1.5;
    }


    @Override
    public void rent(int numDays) {
        if (isAviable()){
            System.out.println("The Economy car available for  " + numDays);
            setAviable(false);
        }else {
            System.out.println("The Economy car is not available");
        }
    }

    @Override
    public String returnCar() {
        return  "Model: " + getModel() +  " FuelEfficiency:" + getFuelEfficiency() + " Year: " + getYear();
    }
    public String displayCarInfo() {
        return "make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", rentalRate=" + getRentalRate() +
                ", full Efficiency=" + getFuelEfficiency();
    }

}
