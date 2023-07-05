package Task_9;

public class Deluxe extends Room {
    private int numberOfBeds;

    public Deluxe(int roomNumber, int nightlyRate, boolean booked) {
        super(roomNumber, nightlyRate, booked);
    }

    public Deluxe(int roomNumber, int nightlyRate, boolean booked, int numberOfBeds) {
        super(roomNumber, nightlyRate, booked);
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public void roomInfo() {
        System.out.println("Room name:Deluxe,Room Number is:" + getRoomNumber() + ",Nightly Rate is:" + getNightlyRate() + ",Number Of Beds:" + getNumberOfBeds() + "Booked or Not?:" + isBooked());
    }
}
