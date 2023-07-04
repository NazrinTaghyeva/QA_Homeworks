package Task_8;

public abstract class Car implements Rentable {
    private String make;
    private String model;
    private int year;
    private double rentalRate;
    private boolean isAviable;

    public Car(String make, String model, int year, double rentalRate, boolean isAviable) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.rentalRate = rentalRate;
        this.isAviable = isAviable;
    }

    public boolean isAviable() {
        return isAviable;
    }

    public void setAviable(boolean aviable) {
        isAviable = aviable;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCharge(int numOfDays);

    public String displayCarInfo() {
        return "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", rentalRate=" + rentalRate;
    }
}
