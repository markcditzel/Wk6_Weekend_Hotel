public class Guest { // OPEN CLASS

    // INSTANCE VARIABLES
    private String firstName;
    private String secondName;
    private int passportNum;
    private String nationality; // this should be made an ENUM - select from a fixed list

    // Constructor
    // NB the passportnum and nationality are allowed to be empty when a new Guest is created
    public Guest(String firstName, String secondName){ // OPEN CON
        this.firstName = firstName;
        this.secondName = secondName;
        this.passportNum = 0;
        this.nationality = "";
    } // CLOSE CON

    //METHODS

    //firstName Getter
    public String getFirstName(){
        return this.firstName;
    }

} // CLOSE CLASS
