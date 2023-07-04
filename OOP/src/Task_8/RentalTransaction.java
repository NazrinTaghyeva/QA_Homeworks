package Task_8;

public class RentalTransaction {
    private Car car;
    private String customerName;
    private int rentalDays;

    public RentalTransaction(Car car, String customerName, int rentalDays) {
        this.car = car;
        this.customerName = customerName;
        this.rentalDays = rentalDays;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public double calculateRentalCost() {
      return car.calculateRentalCharge(50);
    }


    public String displayTransactionInfo() {
        return "car=" + car.getModel() +
                ", customerName='" + customerName + '\'' +
                ", rentalDays=" + rentalDays;
    }
}
