package Task_9;

public class Suite extends Room{
    private boolean hasLivingRoom;

    public Suite(int roomNumber, int nightlyRate, boolean booked) {
        super(roomNumber, nightlyRate, booked);
    }
    public Suite(int roomNumber, int nightlyRate, boolean booked,boolean hasLivingRoom) {
        super(roomNumber, nightlyRate, booked);
        this.hasLivingRoom = hasLivingRoom;
    }
    public boolean isHasLivingRoom() {
        return hasLivingRoom;
    }

    public void setHasLivingRoom(boolean hasLivingRoom) {
        this.hasLivingRoom = hasLivingRoom;
    }
    public void roomInfo() {
        System.out.println("Room name: Suite,Room Number is:" + getRoomNumber() + ",Nightly Rate is:" + getNightlyRate() + ",Has Living Room?:" + isHasLivingRoom()  + "Booked or Not?:" + isBooked());
    }
}
