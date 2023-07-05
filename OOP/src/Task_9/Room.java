package Task_9;

public abstract class Room {
    private int roomNumber;
    private int nightlyRate;
    private boolean booked = true;

    public Room(int roomNumber, int nightlyRate, boolean booked) {
        this.roomNumber = roomNumber;
        this.nightlyRate = nightlyRate;
        this.booked = booked;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNightlyRate() {
        return nightlyRate;
    }

    public void setNightlyRate(int nightlyRate) {
        this.nightlyRate = nightlyRate;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public void booking() {
        checkingAvailability();
    }

    public boolean checkingAvailability() {
        boolean check;
        if (isBooked()) {
            check = true;
            System.out.println("This room is availability...");
        } else {
            check=false;
            System.out.println("This room is not availability...");
        }

        return check;
    }

    public int calculatingCharges(int numOfDays) {
        return getNightlyRate() * numOfDays;
    }
    abstract void roomInfo();
}
