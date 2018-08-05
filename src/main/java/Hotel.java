import java.util.ArrayList;

public class Hotel { //OPEN CLASS

    //INSTANCE VARIABLES

    private String name;
    private int number;
    private String roadName;
    private String townName;
    private String cityName;
    private String postcode; // imagine there is probably a enum available
    //private ArrayList<Rooms> rooms; // define the Class objects (Rooms) to be held in ArrayList
    private ArrayList<Guest> checkedInGuests; // define the Class objects (Guests) to be held in ArrayLists
    private int totalCheckedInGuests;

    // Constructor
    // NB the constructor only requires the Hotel name
    public Hotel(String name){ // OPEN CON
        this.name = name;
        this.checkedInGuests = new ArrayList<>();
        //this.rooms = new ArrayList<Rooms>(); // these should start empty
        this.checkedInGuests = new ArrayList<Guest>(); // these should start empty
        this.totalCheckedInGuests = 0; // this is a running total of all guests checked in

    } // CLOSE CON

    //METHODS

    //GETTER METHODS

    // DIRECT name GETTER
    public String getName(){
        return this.name;
    }

    // DIRECT totalCheckedInGuests GETTER
    public int getRunningTotal(){
        return this.totalCheckedInGuests;
    }

    // DIRECT Count the number of currently Checked in guests
    /** DIRECT count the number of guests checked into Hotel
     * Counts the number of guest object in the ArrayList CheckInGuest
     * RETURN an integer (int)*/
    public int getGuestCount(){
        return checkedInGuests.size();
    }

    // DIRECT Add Guest to ArrayList
    /** DIRECT adds a guest object to the Guest ArrayList (checkedInGuests)
     * TAKES a GUEST object as an argument
     * RETURNS VOID*/
    public void checkInGuest(Guest guest){
        this.checkedInGuests.add(guest);
        this.totalCheckedInGuests += 1;
    }

}//CLOSE CLASS
