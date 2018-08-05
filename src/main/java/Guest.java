public class Guest { // OPEN CLASS

    // INSTANCE VARIABLES
    private String firstName;
    private String secondName;
    private int passportNum;
    private enum nationality; // this should be made an ENUM - select from a fixed list

    // Constructor
    // NB the passportnum and nationality are allowed to be empty when a new Guest is created
    public Guest(String firstName, String secondName, Nationality nationality){ // OPEN CON
        this.firstName = firstName;
        this.secondName = secondName;
        this.passportNum = 0;
        this.nationality = nationality;
    } // CLOSE CON

    //METHODS

    //firstName Getter
    public String getFirstName(){
        return this.firstName;
    }

    //secondName Getter
    public String getSecondName() {
        return this.secondName;
    }

} // CLOSE CLASS
