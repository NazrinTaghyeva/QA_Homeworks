package Task_9;

public class Standart extends Room{

    public Standart(int roomNumber, int nightlyRate, boolean booked) {
        super(roomNumber, nightlyRate, booked);

    }


    @Override
    void roomInfo() {
        System.out.println("Room name:Standard,Room Number is:" + getRoomNumber() + ",Nightly Rate is:"+ getNightlyRate() + ",Booked or Not?:" + isBooked());

    }

}
