import java.util.ArrayList;

public abstract class Room {// OPEN CLASS


    // Instance Variable PROPERTIES
    private int capacity;
    private int phoneNumber;
    private String decor;
    private ArrayList<Guest> guests;

    // CONSTRUCTOR

    public Room(int capacity, String decor){
        this.capacity = capacity;
        this.decor = decor;
        this.guests = new ArrayList<>();
    }

    // METHODS

    // SETTERS

    // DIRECT capacity SETTER
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    // DIRECT decor SETTER
    public void setDecor(String decor){
        this.decor = decor;
    }

    // GETTERS

    // DIRECT capacity Getter
    public int getCapacity(){
        return this.capacity;
    }

    // OTHER

//    // INDIRECT Remove a guest from the Hotel's ArrayList
//    public Guest removeGuestForRoomAssignment(Hotel hotel, Guest guest){
//        return hotel.assignGuestToRoom(guest);
//    }

//    // DIRECT Assign a Guest object returned by "removeGuestForRoomAssignment" method
//    // Guest object then used to populate the Room's ArrayList
//    public void addGuestToRoom(Guest guest){
//        this.guests.add(guest);
//    }

//    // DIRECT capacity checker
//    public boolean checkCapacity(){
//        if
//    }


} // CLOSE CLASS
