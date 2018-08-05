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

    // Constructor
    // NB the constructor only requires the Hotel name
    public Hotel(String name){ // OPEN CON
        this.name = name;
        this.checkedInGuests = new ArrayList<>();
        //this.rooms = new ArrayList<Rooms>(); // these should start empty
        this.checkedInGuests = new ArrayList<Guest>(); // these should start empty

    } // CLOSE CON

    //METHODS

    //GETTER METHODS

    // DIRECT name GETTER
    public String getName(){
        return this.name;
    }

    // DIRECT count the number of guests checked into Hotel
    public int getGuestCount(){
        return checkedInGuests.size();
    }

    // DIRECT add a guest object to the ArrayList<Guest>

//    /**DIRECT rooms GETTER
//     * Counts the number of ALL rooms the hotel has regardless of their subtypes
//     * Utilises the inbuilt .size method of ArrayLists to count the number of entries within
//     * RETURNS INTEGER*/
//    public int getRoomCount(){
//        return rooms.size();
//    }


}//CLOSE CLASS
