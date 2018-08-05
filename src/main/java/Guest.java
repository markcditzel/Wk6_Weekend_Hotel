import java.util.UUID;

public class Guest { // OPEN CLASS

    // INSTANCE VARIABLES
    private int guestID;
    private String firstName;
    private String secondName;
    private int passportNum;
    private Nationality nationality; // this should be made an ENUM - select from a fixed list

    // Constructor
    // NB the passportNum and nationality are allowed to be empty when a new Guest is created
    public Guest(String firstName, String secondName, Nationality nationality){ // OPEN CON
        this.guestID =+ 1;
        this.firstName = firstName;
        this.secondName = secondName;
        this.passportNum = 0;
        this.nationality = nationality;
    } // CLOSE CON

    //METHODS

    //GETTER METHODS

    //DIRECT firstName Getter
    public String getFirstName(){
        return this.firstName;
    }

    //DIRECT secondName Getter
    public String getSecondName() {
        return this.secondName;
    }

    //DIRECT guestID Getter
    public int getGuestID(){
        return this.guestID;
    }

    /** INDIRECT Nationality Getter
    utilises the Nationality class method to return the enum-ITEM's associated FIELD-value,
     which is a String ("Polish")
     CAUTION both the Guest and Nationality class methods are named the same*/
      public String getNationality() {
        return this.nationality.getNationality();
    }

} // CLOSE CLASS
