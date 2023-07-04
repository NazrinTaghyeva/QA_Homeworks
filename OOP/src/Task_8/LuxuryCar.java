package Task_8;

public class LuxuryCar extends Car{
    private  String premiumFeatures[];

    public LuxuryCar(String make, String model, int year, double rentalRate, boolean isAviable) {
        super(make, model, year, rentalRate, isAviable);

    }
    public LuxuryCar(String make, String model, int year, double rentalRate, boolean isAviable,String[] premiumFeatures) {
        super(make, model, year, rentalRate, isAviable);
        this.premiumFeatures = premiumFeatures;

    }

    public String[] getPremiumFeatures() {
        return premiumFeatures;
    }

    public void setPremiumFeatures(String[] premiumFeatures) {
        this.premiumFeatures = premiumFeatures;
    }


    @Override
    public double calculateRentalCharge(int numOfDays) {
        return getRentalRate() * numOfDays * 1.3;
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
        return "Luxury Car " +  "Model: " + getModel() +  " Year: " + getYear();
    }
    public String displayCarInfo() {
        return "make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", rentalRate=" + getRentalRate() ;

    }
}
