package Task_9;

public class Main {
    public static void main(String[] args) {
        Room rooms[] = {
                new Standart(20, 30, false),
                new Deluxe(21, 40, true, 2),
                new Suite(22, 35, true, false)
        };

        for (int i = 0; i < rooms.length; i++) {
            Room room = rooms[i];
            room.roomInfo();
        }
        
        System.out.println("----------------------------------------------------------");
        //burda məsələn booked false olarsa demək bu otaq book edilib və bu səbəbdən də this room is not available olur
        Standart st = new Standart(20, 30, false);
        st.booking();
        Deluxe del =  new Deluxe(21, 40, true, 2);
        del.booking();

    }
}
