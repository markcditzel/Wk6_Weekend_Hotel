public class BedRoom extends Room {


    // Properties / Instance Variable
    // These are in addition to the properties of the Room class
    private int roomNumber;
    private RoomType roomType;
    private double nightlyRate;

    // Constructor
    public BedRoom(int capacity, String decor, int roomNumber, RoomType roomType, double nightlyRate) {
        super(capacity, decor);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.nightlyRate = nightlyRate;
    }

}
